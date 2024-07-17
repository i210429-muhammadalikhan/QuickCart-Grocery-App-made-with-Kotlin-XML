package com.fahad.smd_project


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(private val itemList: List<Item>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
        val priceTextView: TextView = itemView.findViewById(R.id.priceTextView)
        val removeButton: ImageView = itemView.findViewById(R.id.removeButton)
        val addButton: ImageView = itemView.findViewById(R.id.addButton)
        val quantityTextView: TextView = itemView.findViewById(R.id.quantityTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.imageView.setImageResource(item.imageResource)
        holder.descriptionTextView.text = item.description
        holder.priceTextView.text = item.price
        holder.quantityTextView.text = item.quantity.toString()

        // Decrease quantity when remove button is clicked
        holder.removeButton.setOnClickListener {
            var quantity = item.quantity
            if (quantity > 0) {
                quantity--
                item.quantity = quantity
                holder.quantityTextView.text = quantity.toString()
            }
        }

        // Increase quantity when add button is clicked
        holder.addButton.setOnClickListener {
            var quantity = item.quantity
            quantity++
            item.quantity = quantity
            holder.quantityTextView.text = quantity.toString()
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}