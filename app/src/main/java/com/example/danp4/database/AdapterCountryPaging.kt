package com.example.danp4.database

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.danp4.R

class AdapterCountryPaging: PagingDataAdapter<CountryEntity, AdapterCountryPaging.CountryItem>(AdapterCountryPaging.DIFF_CALLBACK) {
    inner class CountryItem (v: View) : RecyclerView.ViewHolder(v)

    companion object{
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<CountryEntity>() {
            override fun areItemsTheSame(oldItem: CountryEntity, newItem: CountryEntity): Boolean {
                return oldItem.CouId == newItem.CouId
            }

            override fun areContentsTheSame(oldItem: CountryEntity, newItem: CountryEntity): Boolean {
                TODO("Not yet implemented")
            }
        }
    }

    override fun onBindViewHolder(holder: CountryItem, position: Int) {
        val item = getItem(position)

        holder.itemView.findViewById<TextView>(R.id.name_en).text = item?.CouNamEn + " - " + item?.CouNamEn
        holder.itemView.findViewById<TextView>(R.id.capital_es).text = item?.CouCapEn + " - " + item?.CouCapEs
        holder.itemView.findViewById<TextView>(R.id.continent_es).text = item?.CouConEn + " - " + item?.CouConEs
        holder.itemView.findViewById<TextView>(R.id.dial_code).text = item?.CouDia
        holder.itemView.findViewById<TextView>(R.id.code_2).text = item?.CouCod2
        holder.itemView.findViewById<TextView>(R.id.code_3).text = item?.CouCod3
        holder.itemView.findViewById<TextView>(R.id.tld).text = item?.CouTld
        holder.itemView.findViewById<TextView>(R.id.km2).text = item?.CouKm2


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryItem {
        return CountryItem(LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent,false))
    }

}