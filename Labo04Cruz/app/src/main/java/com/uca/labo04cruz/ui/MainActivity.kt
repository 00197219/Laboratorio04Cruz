package com.uca.labo04cruz.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.uca.labo04cruz.R

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var actionNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.name_value)
        actionNext = findViewById(R.id.action_share)

        actionNext.setOnClickListener{
            val intent = Intent(this, ShareActivity::class.java)
            intent.putExtra("name", nameEditText.text.toString())
            startActivity(intent)
        }
    }
}