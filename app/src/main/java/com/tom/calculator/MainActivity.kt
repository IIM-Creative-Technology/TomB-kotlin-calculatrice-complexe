package com.tom.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var clicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun calculFunction(view: View) {
        if (!clicked) {
            calcul_texte.text = ""
            clicked = true
        }
        // if the first button is 0, don't add a 0 before the number
        if (view.id == R.id.bouton_1) {
            calcul_texte.text = calcul_texte.text.toString() + "1"   
        } else if (view.id == R.id.bouton_2) {
            calcul_texte.text = calcul_texte.text.toString() + "2"
        } else if (view.id == R.id.bouton_3) {
            calcul_texte.text = calcul_texte.text.toString() + "3"
        } else if (view.id == R.id.bouton_4) {
            calcul_texte.text = calcul_texte.text.toString() + "4"
        } else if (view.id == R.id.bouton_5) {
            calcul_texte.text = calcul_texte.text.toString() + "5"
        } else if (view.id == R.id.bouton_6) {
            calcul_texte.text = calcul_texte.text.toString() + "6"
        } else if (view.id == R.id.bouton_7) {
            calcul_texte.text = calcul_texte.text.toString() + "7"
        } else if (view.id == R.id.bouton_8) {
            calcul_texte.text = calcul_texte.text.toString() + "8"
        } else if (view.id == R.id.bouton_9) {
            calcul_texte.text = calcul_texte.text.toString() + "9"
        } else if (view.id == R.id.bouton_0) {
            calcul_texte.text = calcul_texte.text.toString() + "0"
        } else if (view.id == R.id.bouton_additionner) {
            calcul_texte.text = calcul_texte.text.toString() + "+"
        } else if (view.id == R.id.bouton_soustraire) {
            calcul_texte.text = calcul_texte.text.toString() + "-"
        } else if (view.id == R.id.bouton_multiplier) {
            calcul_texte.text = calcul_texte.text.toString() + "*"
        } else if (view.id == R.id.bouton_diviser) {
            calcul_texte.text = calcul_texte.text.toString() + "/"
        } else if (view.id == R.id.bouton_egal) {
            var fullString = calcul_texte.text.toString()
            var splitString = fullString.split("\\D+".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            var result = 0
            var i = 0
            while (i < splitString.size) {
                if (splitString[i] == "+") {
                    result += splitString[i + 1].toInt()
                } else if (splitString[i] == "-") {
                    result -= splitString[i + 1].toInt()
                } else if (splitString[i] == "*") {
                    result *= splitString[i + 1].toInt()
                } else if (splitString[i] == "/") {
                    result /= splitString[i + 1].toInt()
                } else {
                    result += splitString[i].toInt()
                }
                i++
            }
            calcul_texte.text = result.toString()
            
        } else if (view.id == R.id.bouton_reset) {
            calcul_texte.text = ""
        }
    }
    
}

