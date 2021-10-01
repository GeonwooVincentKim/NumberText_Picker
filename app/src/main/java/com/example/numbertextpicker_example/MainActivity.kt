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
                minValue = 5
                maxValue = 10
            }
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showResultText.text = "User's Number : ${scrollNumberPicker.value}"
        scrollNumberPicker.setOnValueChangedListener { numberPicker, oldValue, newValue ->
            showResultText.text = "Selected : $newValue"
        }
    }
}