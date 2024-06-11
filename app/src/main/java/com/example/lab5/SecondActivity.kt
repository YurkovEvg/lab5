package com.example.lab5

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val sum = intent.getDoubleExtra("SUM", 0.0)

        val textView = findViewById<TextView>(R.id.textViewSum)
        textView.text = "Получить = $sum рублей"
    }
}