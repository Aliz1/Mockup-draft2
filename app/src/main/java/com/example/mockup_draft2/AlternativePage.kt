package com.example.mockup_draft2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

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


    }
}