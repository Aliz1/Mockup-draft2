package com.example.mockup_draft2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class AlternativePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.alternative_trip)

        val buttonClick = findViewById<Button>(R.id.travelButton)
        buttonClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val searchButtonClick = findViewById<Button>(R.id.searchButton)
        searchButtonClick.setOnClickListener {
            val intent = Intent(this, SearchPage::class.java)
            startActivity(intent)
        }

        val backButtonClick = findViewById<ImageButton>(R.id.button_back)
        backButtonClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}