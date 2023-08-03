package com.example.task1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.task1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button1 = findViewById<Button>(R.id.main_button1)
        val button2 = findViewById<Button>(R.id.main_button2)
        val button3 = findViewById<Button>(R.id.main_button3)
        val scoreView: TextView = findViewById(R.id.scoreView)




        button1.setOnClickListener {
            score++
            scoreView.text = "Score: $score"
        }

        button2.setOnClickListener {
            score += 2
            scoreView.text = "Score: $score"
        }

        button3.setOnClickListener {
            score += 3
            scoreView.text = "Score: $score"
        }
    }
}
