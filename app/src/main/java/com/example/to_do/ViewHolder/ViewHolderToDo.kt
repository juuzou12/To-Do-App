package com.example.to_do.ViewHolder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.to_do.R
import com.example.to_do.models.ToDoModel
import kotlinx.android.synthetic.main.newtasks.view.*

class ViewHolderToDo (itemView:View):RecyclerView.ViewHolder(itemView) {
    fun juuzou(toDo: ToDoModel) {
        itemView.findViewById<TextView>(R.id.header).setText(toDo.Header)
        itemView.findViewById<TextView>(R.id.subject).setText(toDo.Subject)
    }
}
