package com.example.mymemesactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvFirstNext:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvFirstNext=findViewById(R.id.tvFirstNext)
        tvFirstNext.setOnClickListener {
            val intent=Intent(this,MymemesActivity2::class.java)
            startActivity(intent)
        }

    }
}