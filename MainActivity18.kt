package com.alikhan.projecttrial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity18 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main18)


        val toolnavigationView = findViewById<ImageView>(R.id.toolnavigationView)

        toolnavigationView.setOnClickListener {
            val intent = Intent(this, MainActivity19::class.java)
            startActivity(intent)
        }

        val linenavigationView = findViewById<ImageView>(R.id.linenavigationView)

        linenavigationView.setOnClickListener {
            val intent = Intent(this, MainActivity17::class.java)
            startActivity(intent)
        }

        val notificationemojitext = findViewById<TextView>(R.id.notificationemojitext)

        notificationemojitext.setOnClickListener {
            val intent = Intent(this, MainActivity14::class.java)
            startActivity(intent)
        }
    }
}

