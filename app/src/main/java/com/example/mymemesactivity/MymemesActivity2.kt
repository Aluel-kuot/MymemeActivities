package com.example.mymemesactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MymemesActivity2 : AppCompatActivity() {
    lateinit var tvFirstPrevious: TextView
    lateinit var tvSecondNext: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mymemes2)
        tvFirstPrevious = findViewById(R.id.tvFirstPrevious)
        tvFirstPrevious.setOnClickListener {
            val intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        tvSecondNext = findViewById(R.id.tvSecondNext)
        tvSecondNext.setOnClickListener {
            val intent = Intent(this, MyMemesActivity3::class.java)
            startActivity(intent)

        }


    }
}