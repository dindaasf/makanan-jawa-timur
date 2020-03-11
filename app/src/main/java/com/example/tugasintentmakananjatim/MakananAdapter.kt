package com.example.tugasintentmakananjatim

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.listmakanan.view.*

class MakananAdapter (val ListItemMakanan: List<DataMakanan>, val clickListener: (DataMakanan)-> Unit ) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.listmakanan, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(ListItemMakanan[position], clickListener) //To change body of created functions use File | Settings | File Templates.

    }

    override fun getItemCount() =ListItemMakanan.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(makanan: DataMakanan, clickListener: (DataMakanan) -> Unit) {
           // Picasso.get().load(makanan.image).into(itemView.imgmakanan)
            //Picasso.get().load(makanan.image).into(itemView.imageView)
            itemView.imageView.setImageResource (makanan.gambar)
            itemView.nama_makanan.text = makanan.makanan
            itemView.kota.text = makanan.kota
            itemView.setOnClickListener{clickListener(makanan)}
        }
    }
}
