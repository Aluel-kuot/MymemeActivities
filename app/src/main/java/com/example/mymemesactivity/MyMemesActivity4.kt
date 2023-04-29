package com.example.mymemesactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MyMemesActivity4 : AppCompatActivity() {
    lateinit var tvThirdPrevious:TextView
    lateinit var tvFourthNext:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_memes4)
        tvThirdPrevious=findViewById(R.id.tvThirdPrevious)
        tvThirdPrevious.setOnClickListener {
            val intent=Intent(this,MyMemesActivity3::class.java)
            startActivity(intent)
        }
        tvFourthNext=findViewById(R.id.tvFourthNext)
        tvFourthNext.setOnClickListener {
            val intent=Intent(this,MyMemesActivity5::class.java)
            startActivity(intent)
        }
    }
}