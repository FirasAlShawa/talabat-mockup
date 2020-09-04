package com.firasalshawa.talabat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RowItemAdapter(var list : MutableList<RowItem>) :
    RecyclerView.Adapter<RowItemAdapter.RowItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowItemViewHolder {
       val inflater = LayoutInflater.from(parent.context)
        return RowItemViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: RowItemViewHolder, position: Int) {
       val rowItem = list[position]
        holder.bind(rowItem)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    class RowItemViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(R.layout.row_item,parent,false)){
    private var RowItemImage : ImageView? = null;
    private var RowItemName : TextView? = null;
    private var RowItemPrice : TextView? = null;

    init {
        RowItemImage=itemView.findViewById(R.id.RowItemImage)
        RowItemName=itemView.findViewById(R.id.RowItemName)
        RowItemPrice=itemView.findViewById(R.id.RowItemPrice)
    }

    fun bind(rowItem: RowItem){
        RowItemName?.text = rowItem.Name
        RowItemPrice?.text = rowItem.Price
    }

    }

}