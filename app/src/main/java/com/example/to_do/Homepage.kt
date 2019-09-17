package com.example.to_do

import ToDoAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.to_do.models.ToDoDatabase

import com.example.to_do.models.ToDoModel
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_homepage.*
import androidx.paging.PagedList
import androidx.recyclerview.widget.DiffUtil
import com.example.to_do.ViewHolder.ViewHolderToDo

import com.shreyaspatil.firebase.recyclerpagination.DatabasePagingOptions
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T


class Homepage : AppCompatActivity() {

    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_homepage)

//        // ...
        database = FirebaseDatabase.getInstance().getReference("NOTES")
        val save=findViewById<Button>(R.id.save)as Button

        save.setOnClickListener{
            writeNewUser("","","")
        }

        val recyclerView=findViewById<RecyclerView>(R.id.rvChapterList)as RecyclerView
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        val toDoData=ArrayList<ToDoModel>()
        toDoData.add(ToDoModel("Meeting with Foreback","talk about stuff"))
        val adapter=ToDoAdapter()
        recyclerView.adapter=adapter
        adapter.submitList(toDoData)




}

    private fun writeNewUser(header: String, subject: String, body: String?) {

       var Header=header_edt.text.toString()
        var Subject=subject_edt.text.toString()
        var Body=note_edt.text.toString()
        val data = ToDoDatabase(Header, Subject,Body)
        database.child("notes").child("subNotes").setValue(data)
     }
}
