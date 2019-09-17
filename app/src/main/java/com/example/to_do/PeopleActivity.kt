package com.example.to_do

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.squareup.picasso.Picasso

class PeopleActivity : AppCompatActivity() {

    internal lateinit var animation: Animation
    internal lateinit var animation1: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_people)

        val back=findViewById<ImageView>(R.id.back)as ImageView
        val viewLayout=findViewById<ConstraintLayout>(R.id.viewLayout)as ConstraintLayout
        val all=findViewById<ConstraintLayout>(R.id.all)as ConstraintLayout
        val chat=findViewById<ConstraintLayout>(R.id.chat)as ConstraintLayout
        val mainLayout=findViewById<ConstraintLayout>(R.id.mainLayout)as ConstraintLayout
        val messageLayout=findViewById<ConstraintLayout>(R.id.messageLayout)as ConstraintLayout
        val fab_back=findViewById<FloatingActionButton>(R.id.fab_back)as FloatingActionButton
        val back_img=findViewById<FloatingActionButton>(R.id.back_img)as FloatingActionButton

        back_img.setOnClickListener{
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_up, R.anim.slide_down)
            finish()
        }
        fab_back.setOnClickListener{
            messageLayout.visibility=View.GONE
            mainLayout.visibility=View.VISIBLE
            mainLayout.startAnimation(animation1)
        }

        animation= AnimationUtils.loadAnimation(applicationContext,R.anim.slide_down)
        animation1= AnimationUtils.loadAnimation(applicationContext,R.anim.slide_up)

        chat.setOnClickListener{
            viewLayout.visibility=View.VISIBLE
            all.visibility=View.GONE
            viewLayout.startAnimation(animation1)
        }

        back.setOnClickListener{
            viewLayout.visibility=View.GONE
            all.visibility=View.VISIBLE
            all.startAnimation(animation1)

        }
        val chat_btn=findViewById<TextView>(R.id.chat_btn)as TextView
        chat_btn.setOnClickListener{
            messageLayout.visibility=View.VISIBLE
            mainLayout.visibility=View.GONE
            messageLayout.startAnimation(animation1)
        }


//        val imageView=findViewById<ImageView>(R.id.imageView)as ImageView
//        Picasso.with(this)
//            .load(R.drawable.emoji)
//            .fit()
//            .into(imageView)
    }
}
