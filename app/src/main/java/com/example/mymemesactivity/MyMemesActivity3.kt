package com.example.mymemesactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MyMemesActivity3 : AppCompatActivity() {
lateinit var tvSecondPrevious: TextView
lateinit var tvThirdNext: TextView
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_my_memes3)
    tvSecondPrevious = findViewById(R.id.tvSecondPrevious)
    tvSecondPrevious.setOnClickListener {
        val intent = Intent(this, MymemesActivity2::class.java)
        startActivity(intent)
    }
    tvThirdNext = findViewById(R.id.tvThirdNext)
    tvThirdNext.setOnClickListener {
        val intent = Intent(this, MyMemesActivity4::class.java)
        startActivity(intent)

    }
}
}

