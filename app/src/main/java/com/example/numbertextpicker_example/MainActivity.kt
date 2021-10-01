package com.example.numbertextpicker_example

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.NumberPicker
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val showResultText: TextView by lazy {
        findViewById(R.id.showResultText)
    }

    private val scrollNumberPicker: NumberPicker by lazy {
        findViewById<NumberPicker>(R.id.scrollNumberPicker)
            .apply {
                minValue = 0
                maxValue = 6
                displayedValues = places
            }
    }

    private val places: Array<String> by lazy{
        resources.getStringArray(R.array.locations)
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showResultText.text = "User's Location : ${scrollNumberPicker.value}"
        scrollNumberPicker.setOnValueChangedListener { numberPicker, oldValue, newValue ->
            showResultText.text = "User's Location : ${places[newValue]}"
        }
    }
}