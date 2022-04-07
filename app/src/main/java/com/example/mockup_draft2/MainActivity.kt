package com.example.mockup_draft2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        val buttonClick = findViewById<Button>(R.id.searchButton)
        buttonClick.setOnClickListener {
            val intent = Intent(this, SearchPage::class.java)
            startActivity(intent)
        }
        val altButtonClick = findViewById<Button>(R.id.alternativeButton)
        altButtonClick.setOnClickListener {
            val intent = Intent(this, AlternativePage::class.java)
            startActivity(intent)
        }

    }
}