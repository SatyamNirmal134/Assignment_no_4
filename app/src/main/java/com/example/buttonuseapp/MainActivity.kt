package com.example.myandroidapp

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.buttonuseapp.R

class MainActivity : AppCompatActivity() {
    // Counter for Button 1
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize TextView and Buttons
        val textView = findViewById<TextView>(R.id.textView)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        // Button 1: Increment Counter and Change Text
        button1.setOnClickListener {
            counter++
            textView.text = "Button clicked $counter times!"
        }

        // Button 2: Change Height
        button2.setOnClickListener {
            textView.layoutParams.height = 300 // Set height in pixels
            textView.requestLayout() // Apply the height change
        }

        // Button 3: Center Text on Screen
        button3.setOnClickListener {
            textView.gravity = Gravity.CENTER
        }
    }
}
