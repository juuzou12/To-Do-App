import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.to_do.R
import com.example.to_do.ViewHolder.ViewHolderToDo
import com.example.to_do.models.ToDoModel
import com.shreyaspatil.firebase.recyclerpagination.LoadingState
import androidx.annotation.NonNull

import com.google.firebase.database.DatabaseReference


//package com.example.to_do.Adapter
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.to_do.R
//import com.example.to_do.models.ToDoModel
//
//@Suppress("UNREACHABLE_CODE")
//class ToDoAdapter(val todoList: ArrayList<ToDoModel>): RecyclerView.Adapter<ToDoAdapter.ViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//
//        val view=LayoutInflater.from(parent.context).inflate(R.layout.newtasks,parent,false)
//        return ViewHolder(view)
//    }
//
//    override fun getItemCount(): Int {
//
//        return todoList.size
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//
//        val toDo :ToDoModel=todoList[position]
//        holder.textviewHeader.text= toDo.Header
//        holder.textviewSubject.text= toDo.Subject
//
//
//
//
//    }
//
//
//class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//    val textviewHeader = itemView.findViewById<TextView>(R.id.header) as TextView
//    val textviewSubject = itemView.findViewById<TextView>(R.id.subject) as TextView
//
//
//}


//    }
//
//}
//
//

//TODO>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>THE SECOND METHODS>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

class ToDoAdapter :androidx.recyclerview.widget.ListAdapter<ToDoModel,ViewHolderToDo>(object :DiffUtil.ItemCallback<ToDoModel>(){
    override fun areItemsTheSame(oldItem: ToDoModel, newItem: ToDoModel): Boolean {
        return true
    }

    override fun areContentsTheSame(oldItem: ToDoModel, newItem: ToDoModel): Boolean {
        return true
    }

}) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderToDo {
        val view = LayoutInflater.from(parent.context).inflate(com.example.to_do.R.layout.newtasks, parent, false)
        return ViewHolderToDo(view)
    }

    override fun onBindViewHolder(holder: ViewHolderToDo, position: Int) {
        holder.juuzou(getItem(position))

    }

}

















































