package com.example.to_do

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_main)
       val start=findViewById<Button>(R.id.start)as Button
        start.setOnClickListener{
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_up, R.anim.slide_down)
            finish()
        }
    }
}
