package com.example.tets

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val enterText = findViewById<EditText>(R.id.enterText)
        val sendButton = findViewById<Button>(R.id.button)
        sendButton.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("text", enterText.text)
            startActivity(intent)
        }

    }
}
