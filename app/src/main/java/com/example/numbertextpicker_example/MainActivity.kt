package com.example.numbertextpicker_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.NumberPicker
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val showResultText: TextView by lazy {
        findViewById(R.id.showResultText)
    }

    private val scrollNumberPicker: NumberPicker by lazy {
//        findViewById(R.id.scrollNumberPicker)
        findViewById<NumberPicker>(R.id.scrollNumberPicker)
            .apply{
                minValue = 5
                maxValue = 10
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showResultText
        scrollNumberPicker
    }
}