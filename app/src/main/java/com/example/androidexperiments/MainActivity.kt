package com.example.androidexperiments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.btn_roll)
        val resultText = findViewById<TextView>(R.id.tv_result)

        resultText.text = "Dice Rolled!"

        rollButton.setOnClickListener {
            val randomInt = Random().nextInt(6) + 1
            resultText.text = randomInt.toString()
            rollDice()
        }
    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}
