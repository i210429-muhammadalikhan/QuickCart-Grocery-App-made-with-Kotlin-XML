package com.fahad.smd_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FifthActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: SnacksAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_page)


        recyclerView = findViewById(R.id.snacksrecycler)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Create dummy data for testing
        val itemList = listOf(
            Snacks(R.drawable.img, "Arla DANO Full Cream Milk Powder Instant", "Rs 182"),
            Snacks(R.drawable.img_1, "Another Snack Name", "Rs 200"),
            // Add more items as needed
        )

        // Initialize the adapter with the dummy data
        adapter = SnacksAdapter(this, itemList)

        // Set the adapter to the RecyclerView
        recyclerView.adapter = adapter



    }
}