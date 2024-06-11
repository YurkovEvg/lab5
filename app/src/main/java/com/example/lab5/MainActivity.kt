package com.example.lab5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextDepositAmount = findViewById<EditText>(R.id.editTextDepositAmount)
        val editTextDuration = findViewById<EditText>(R.id.editTextDuration)
        val buttonCalculate = findViewById<Button>(R.id.buttonCalculate)

        buttonCalculate.setOnClickListener {
            val depositAmount = editTextDepositAmount.text.toString().toDoubleOrNull() ?: 0.0
            val duration = editTextDuration.text.toString().toIntOrNull() ?: 0

            val sum = calculateDepositSum(depositAmount, duration)

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("SUM", sum)
            startActivity(intent)
        }
    }

    private fun calculateDepositSum(depositAmount: Double, duration: Int): Double {
        // Рассчет суммы вклада
        // здесь должен быть ваш алгоритм
        return 150.0
    }
}