package com.example.knote

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_note.view.*

class NoteAdapter(val notes: List<Note>, val context: Context) :
    RecyclerView.Adapter<NoteAdapter.ViewHolder>() {

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return notes.size
    }

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_note, parent, false))
    }

    // Binds each animal in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (notes.get(position).title.isEmpty())
            holder?.tvTitle?.text = "Title" else
            holder?.tvTitle?.text = notes.get(position).title
        holder?.tvContent?.text = notes.get(position).content
        holder?.tvDate?.text = notes.get(position).date
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val tvTitle = view.tvTitle
        val tvContent = view.tvContent
        val tvDate = view.tvDate
    }
    /*fun notify(notes: List<Note>){
        notifyDataSetChanged()
    }*/

}