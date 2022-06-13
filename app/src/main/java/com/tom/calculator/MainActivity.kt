package com.tom.calculator

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var a: Int = 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("le nombre de var est " + a)
    }
    fun changeText(view: View) {
        if (view.id == R.id.button1) {
            montexte.text = "Bouton 1 cliqué"
        } else if (view.id == R.id.button2) {
            montexte.text = "Bouton 2 cliqué"
        }
    }
}
