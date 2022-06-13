package com.tom.calculator

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.check

class MainActivity : AppCompatActivity() {
    var a: Int = 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("le nombre de var est " + a)


        button.setOnClickListener {
            var montantTotal: Int = 0
            
            // if checkbox1 is checked, add 13 to the total
            if (checkBox1.isChecked) {
                montantTotal += 13
            }
            if (checkBox2.isChecked) {
                montantTotal += 5
            }
            if (checkBox3.isChecked) {
                montantTotal += 17
            }
            if (checkBox4.isChecked) {
                montantTotal += 1
            }
            textView3.visibility = View.VISIBLE
            textView3.text = "Votre total est de " + montantTotal.toString() + "€"

        }
    }
}
