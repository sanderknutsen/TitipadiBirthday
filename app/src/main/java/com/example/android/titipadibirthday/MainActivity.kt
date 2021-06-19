package com.example.android.titipadibirthday

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: ImageButton = findViewById(R.id.imageButton)
        button.setOnClickListener {
            val intent = Intent(this, GiftActivity::class.java)
            startActivity(intent)
        }
    }
}