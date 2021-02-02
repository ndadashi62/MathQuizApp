package com.example.mathquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        editTextUserScore.setText(intent.getStringExtra("key"))


        btnBack.setOnClickListener {
            back()
        }
    }

    fun back() {

        val intentBack = Intent(this@ResultActivity, MainActivity::class.java)
        val username :String=editTextUsername.text.toString()
        val score=editTextUserScore.text.toString()
        intentBack.putExtra("nameandscore","$username$score")
        startActivity(intentBack)

    }
}

