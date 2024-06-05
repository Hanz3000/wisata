package com.example.ngopii

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ngopii.databinding.ActivityListviewBinding

class List_MenuAdapter(private val items: List<List_Menu>, private val listener: OnItemClickListener) : RecyclerView.Adapter<List_MenuAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto_menu: ImageView = itemView.findViewById(R.id.foto_menu)
        val nama_wisata: TextView = itemView.findViewById(R.id.nama_wisata)
        val lokasi: TextView = itemView.findViewById(R.id.lokasi)
        val rating: RatingBar = itemView.findViewById(R.id.rating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_listview, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = items[position]
        holder.foto_menu.setImageResource(currentItem.foto_wisata)
        holder.nama_wisata.text = currentItem.nama_wisata
        holder.lokasi.text = currentItem.lokasi
        holder.rating.rating = currentItem.rating.toFloat()

        holder.itemView.setOnClickListener {
            listener.onItemClick(position)
        }
    }

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener) {

    }
}
