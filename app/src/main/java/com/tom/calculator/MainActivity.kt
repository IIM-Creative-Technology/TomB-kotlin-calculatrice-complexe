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
        when (view.id) {
            R.id.bouton_0 -> calcul_texte.append("0")
            R.id.bouton_1 -> calcul_texte.append("1")
            R.id.bouton_2 -> calcul_texte.append("2")
            R.id.bouton_3 -> calcul_texte.append("3")
            R.id.bouton_4 -> calcul_texte.append("4")
            R.id.bouton_5 -> calcul_texte.append("5")
            R.id.bouton_6 -> calcul_texte.append("6")
            R.id.bouton_7 -> calcul_texte.append("7")
            R.id.bouton_8 -> calcul_texte.append("8")
            R.id.bouton_9 -> calcul_texte.append("9")
            R.id.bouton_additionner -> calcul_texte.append(" + ")
            R.id.bouton_multiplier -> calcul_texte.append(" * ")
            R.id.bouton_diviser -> calcul_texte.append(" / ")
            R.id.bouton_soustraire -> calcul_texte.append(" - ")
            R.id.bouton_modulo -> calcul_texte.append(" % ")
            R.id.bouton_decimal -> calcul_texte.append(".")
            R.id.bouton_reset -> calcul_texte.text = ""
            R.id.bouton_egal -> {
                calculResult(view, calcul_texte.text.toString())
            }
        }
    }

    fun calculResult(view: View, fullOperation: String) {
        var operation = fullOperation.split(" ").toMutableList()
        for (i in operation.indices) {
            if (operation[i].toDoubleOrNull() != null) {
                operation[i] = operation[i].toDouble().toString()
            }
        }
        var result = 0.0
        var i = 0
        while (i < operation.size) {
            if (operation[i] == "+") {
                result += operation[i + 1].toDouble()
                i += 2
            } else if (operation[i] == "-") {
                result -= operation[i + 1].toDouble()
                i += 2
            } else if (operation[i] == "*") {
                result *= operation[i + 1].toDouble()
                i += 2
            } else if (operation[i] == "/") {
                result /= operation[i + 1].toDouble()
                i += 2
            } else if (operation[i] == "%") {
                result %= operation[i + 1].toDouble()
                i += 2
            } else {
                result += operation[i].toDouble()
                i++
            }
        }
        calcul_texte.text = result.toString()
    }
}
