package com.example.mathquizapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var randomNum1: Int = 0
    var randomNum2: Int = 0
    var operator: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnGenerate.setOnClickListener {
            generate()
        }
        btnValidate.setOnClickListener {
            validate()
        }
    }


    //toDO 1 :making generate function for generatin the operations
    private fun generate() {

        val random = Random.nextInt(4)
        randomNum1 = Random.nextInt(10)
        randomNum2 = Random.nextInt(10)
        when (random) {
            0 -> {
                operator = "+"
                validate()
            }
            1 -> {
                operator = "-"
            }
            2 -> {
                operator = "*"
            }
            3 -> {
                operator = "/"
            }
            else -> operator = "?"
        }
        textViewDisplayGenerate.setText(("$randomNum1 $operator $randomNum2"))
    }

    //  toDO 2 :making validate function for validatin
    fun validate() {

        var resultAdd=randomNum1+randomNum2
        var resultMinus=randomNum1-randomNum2
        var resultMultiple=randomNum1*randomNum2
        var resultDivision= randomNum1/randomNum2

        var result = editTextUserAnswer.text.toString().toInt()

        if (result ==resultAdd || result==resultMinus || result==resultMultiple || result==resultDivision) {
            textViewDisplayGenerate.setText("Correct :)").toString()
        }
      else  (textViewDisplayGenerate.setText("Incorrect :(")).toString()

    }





}


