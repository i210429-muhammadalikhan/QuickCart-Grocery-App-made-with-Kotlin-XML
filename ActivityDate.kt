package com.fahad.smd_project

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val spinnerDate: Spinner = findViewById(R.id.spinnerDate)

// Create an array of date options (e.g., for the next 7 days)
        val dateOptions = arrayOf(
            "Select Date",
            "April 12, 2024",
            "April 13, 2024",
            "April 14, 2024",
            "April 15, 2024",
            "April 16, 2024",
            "April 17, 2024",
            "April 18, 2024"
        )

// Create an ArrayAdapter using the string array and a default spinner layout
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, dateOptions)

// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

// Apply the adapter to the spinner
        spinnerDate.adapter = adapter

// Set a listener to handle item selection
        spinnerDate.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedDate = dateOptions[position]
                // Handle the selected date (e.g., display it, use it for further processing)
                Toast.makeText(
                    this@MainActivity2,
                    "Selected Date: $selectedDate",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle case where nothing is selected
            }
        }


        // Find all six buttons by their IDs
        val timeButton1: Button = findViewById(R.id.timeButton1)
        val timeButton2: Button = findViewById(R.id.timeButton2)
        val timeButton3: Button = findViewById(R.id.timeButton3)
        val timeButton4: Button = findViewById(R.id.timeButton4)
        val timeButton5: Button = findViewById(R.id.timeButton5)
        val timeButton6: Button = findViewById(R.id.timeButton6)

        // Set click listeners for each button
        timeButton1.setOnClickListener { onTimeButtonClick(it) }
        timeButton2.setOnClickListener { onTimeButtonClick(it) }
        timeButton3.setOnClickListener { onTimeButtonClick(it) }
        timeButton4.setOnClickListener { onTimeButtonClick(it) }
        timeButton5.setOnClickListener { onTimeButtonClick(it) }
        timeButton6.setOnClickListener { onTimeButtonClick(it) }

    }


    fun onTimeButtonClick(view: View) {
        // Cast the view to a Button
        val button = view as Button

        // Set the text color of the button to green
        button.setTextColor(Color.parseColor("#00FF00"))

        // Show a toast message for button click
        Toast.makeText(this, "Button clicked: ${button.text}", Toast.LENGTH_SHORT).show()
    }


}