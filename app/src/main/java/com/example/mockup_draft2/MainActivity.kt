package com.example.mockup_draft2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //Check if dark mode
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.Theme_Mockupdraft2)
        }

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