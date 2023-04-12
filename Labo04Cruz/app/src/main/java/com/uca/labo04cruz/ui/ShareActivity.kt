package com.uca.labo04cruz.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.uca.labo04cruz.R
import com.uca.labo04cruz.R.id.name_text_view

class ShareActivity : AppCompatActivity() {

    private lateinit var nameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)

    nameTextView = findViewById(name_text_view)

    val nameShared = intent.getStringExtra("name").toString()
    nameTextView.text="Hello${nameShared}"

    }
}