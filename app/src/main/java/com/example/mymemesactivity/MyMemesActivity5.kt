package com.example.mymemesactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MyMemesActivity5 : AppCompatActivity() {
    lateinit var fourthPrevious:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_memes5)
        fourthPrevious=findViewById(R.id.tvFourthPrevious)
        fourthPrevious.setOnClickListener {
            val intent=Intent(this,MyMemesActivity4::class.java)
            startActivity(intent)
        }
    }
}