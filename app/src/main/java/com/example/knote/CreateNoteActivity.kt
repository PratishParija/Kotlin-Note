package com.example.knote

import android.annotation.TargetApi
import android.os.AsyncTask
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_note.*
import kotlinx.android.synthetic.main.toolbar.*
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*

class CreateNoteActivity : AppCompatActivity() {
    private var appDatabase: AppDatabase? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_note)
        init()
    }

    private fun init() {
        toolbarTitle.visibility = View.GONE
        ivBack.visibility = View.VISIBLE
        ivDone.visibility = View.VISIBLE
        ivBack.setOnClickListener(View.OnClickListener {
            onBackPressed()
        })
        ivDone.setOnClickListener(View.OnClickListener {
            saveToDb()
        })
    }

    @TargetApi(Build.VERSION_CODES.O)
    private fun saveToDb() {
        appDatabase = AppDatabase.getDatabase(this)!!
        if (etContent.text.toString().isEmpty())
            Toast.makeText(this, "Please enter any content...", Toast.LENGTH_LONG)
        else {
            val note = Note(
                title = etTitle.text.toString(),
                content = etContent.text.toString(),
                date = getCurrentDateTime()
            )
            InsertNote(this, note).execute()
            setResult(RESULT_OK);
            finish(); }
    }

    fun getCurrentDateTime(): String {
        val formatter = SimpleDateFormat("dd/MM/yy HH:mm")
        return formatter.format(Calendar.getInstance().time)
    }

    private class InsertNote(var context: CreateNoteActivity, var note: Note) :
        AsyncTask<Void, Void, Boolean>() {
        override fun doInBackground(vararg params: Void?): Boolean {
            context.appDatabase!!.noteDao().insert(note)
            return true
        }

        override fun onPostExecute(bool: Boolean?) {
            if (bool!!) {
                Toast.makeText(context, "Added to Database", Toast.LENGTH_LONG).show()

            }
        }
    }


}
