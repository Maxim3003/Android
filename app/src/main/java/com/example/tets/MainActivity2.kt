package com.example.tets

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val textView = findViewById<TextView>(R.id.textView)
        val buttonBack = findViewById<Button>(R.id.buttonBack)
        var intent = intent
        textView.text  = intent.getStringExtra("text")
        buttonBack.setOnClickListener {
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}

