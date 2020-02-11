package com.example.psikodiyetapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //Nothing done here, main page, small info and click for more button, goes to first question.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickForMoreButton = findViewById<Button>(R.id.ClickForMoreButton)
        clickForMoreButton.setOnClickListener(){
            val intent = Intent(this, QuestionActivity1::class.java)
            intent.putExtra("keyIdentifier", 10)
            startActivity(intent)
        }
    }
}
