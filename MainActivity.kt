package com.example.tubescinema

import android.content.Intent
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_madaf)

        val button1 = findViewById<Button>(R.id.button1m)
        val button2 = findViewById<Button>(R.id.button2m)

        button1.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener{
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    }
