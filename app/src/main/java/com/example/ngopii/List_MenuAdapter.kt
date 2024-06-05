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
import com.google.android.ads.mediationtestsuite.viewmodels.ItemViewHolder

class List_MenuAdapter(private var items: List<List_Menu>): RecyclerView.Adapter<List_MenuAdapter.ItemViewHolder>() {

    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        lateinit var binding: ActivityListviewBinding
        val foto_menu: ImageView = binding.fotoMenu
        val nama_wisata: TextView = binding.namaWisata
        val lokasi: TextView = binding.lokasi
        var rating: RatingBar = binding.rating

    }
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        val layoutInflater:LayoutInflater = LayoutInflater.from(mContext)
//        val view:View = layoutInflater.inflate(resources, null)
//
//        val foto_menu:ImageView = binding.fotoMenu
//        val nama_menu:TextView = binding.namaWisata
//        val harga_menu:TextView = binding.lokasi
//        var rating:RatingBar = binding.rating
//
//        val mItem:List_Menu = items[position]
//        foto_menu.setImageDrawable(mContext.resources.getDrawable(mItem.foto_wisata))
//        nama_menu.text = mItem.nama_wisata
//        harga_menu.text = mItem.lokasi
//        rating.rating = mItem.rating.toFloat()
//
//        return view
//    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.activity_listview, parent, false)
        return ItemViewHolder(layout)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item:List_Menu = items[position]
        holder.foto_menu.setImageResource(item.foto_wisata)
        holder.nama_wisata.text = item.nama_wisata
        holder.lokasi.text = item.lokasi
        holder.rating.rating = item.rating.toFloat()
    }
}