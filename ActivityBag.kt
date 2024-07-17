package com.fahad.smd_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val itemList = listOf(
            Item(R.drawable.img, "Arla DANO Full Cream\nMilk Powder Instant", "$10", 1), // Initial quantity is 1
            Item(R.drawable.img_1, "Arla DANO Full Cream\nMilk Powder Instant", "$20", 1), // Initial quantity is 1
            // Add more items as needed, each with its quantity
        )
        val adapter = CustomAdapter(itemList)
        recyclerView.adapter = adapter


        val backArrow: Button = findViewById(R.id.buttonConfirmOrder)
        backArrow.setOnClickListener {
            // Start NineteenActivity
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }



    }
}