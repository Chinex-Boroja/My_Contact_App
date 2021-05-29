package com.example.mycategoryapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomCategoryAdapter (val context: Context, private val list: List<String>): RecyclerView.Adapter<CustomCategoryAdapter.ViewHolder>(){


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val text1: TextView = itemView.findViewById(R.id.text1)
        val text2: TextView = itemView.findViewById(R.id.text2)

        init{
            itemView.setOnClickListener {
                callDetailsActivity()
            }
        }

        private fun callDetailsActivity() {
            val intent = Intent(context, DetailsCategory::class.java).apply {
                putExtra("CATEGORY",itemView.findViewById<TextView>(R.id.text2).text.toString())
            }
            context.startActivity(intent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.custom_category, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text1.text = list[position].first().uppercaseChar().toString()
        holder.text2.text = list[position]
    }

    override fun getItemCount() = list.size
}