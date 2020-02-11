package com.example.knote

import android.app.Activity
import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var appDatabase: AppDatabase? = null
    private var adapter: NoteAdapter? = null
    val notes = ArrayList<Note>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recView.layoutManager = LinearLayoutManager(this)
        recView.layoutManager = GridLayoutManager(this, 2)
        adapter = NoteAdapter(notes, this)
        appDatabase = AppDatabase.getDatabase(this)!!
        fab.setOnClickListener { view ->
            val intent = Intent(this, CreateNoteActivity::class.java)
            startActivityForResult(intent,1000)
        }
        GetNote(this).execute()
        recView.adapter = adapter
    }

    fun onData(note: List<Note>) {
        notes.clear();
        notes.addAll(note);
        adapter?.notifyDataSetChanged()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1000 -> {
                if (resultCode == Activity.RESULT_OK) {
                    GetNote(this).execute()
                }
            }
        }
    }

    private class GetNote(var context: MainActivity) :
        AsyncTask<Void, Void, List<Note>>() {
        override fun doInBackground(vararg params: Void?): List<Note> {
            return context.appDatabase!!.noteDao().getAll()
        }

        override fun onPostExecute(noteList: List<Note>?) {
            if (noteList!!.size > 0) {
                context.onData(noteList)
            }
        }
    }

}
