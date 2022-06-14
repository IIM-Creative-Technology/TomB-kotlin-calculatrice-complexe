package com.tom.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var radioVar: RadioGroup? = null
    lateinit var buttonVar: Button
    lateinit var radioButtonVar: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioVar = findViewById(R.id.radioGroup)
        buttonVar = findViewById(R.id.button)
        buttonVar.setOnClickListener {

            val selectedId: Int = radioVar!!.checkedRadioButtonId
            Log.i("DEbug", selectedId.toString())
            radioButtonVar = findViewById(selectedId)
            Toast.makeText(baseContext,radioButtonVar.text.toString(),Toast.LENGTH_LONG).show()

        }
    }
}

