package com.example.logintablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2) // Make sure this layout exists

        // Retrieve the username from the Intent
        val username = intent.getStringExtra("USERNAME")

        // Find your TextView and set the username (assuming you have a TextView to display it)
        val welcomeTextView: TextView = findViewById(R.id.tvWelcome)
        welcomeTextView.text = "Welcome back, $username!"
    }
}
