package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById<Button>(R.id.roll_btn)

        btnRoll.setOnClickListener(){
            val randomInt =  (1..6).random()
            val tvResult : TextView = findViewById(R.id.result_txt)
            tvResult.text = randomInt.toString()
            Toast.makeText(this, "Button is click", Toast.LENGTH_LONG).show()
        }

    }
}