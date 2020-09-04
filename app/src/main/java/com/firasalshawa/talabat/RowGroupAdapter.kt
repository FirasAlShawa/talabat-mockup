package com.firasalshawa.talabat

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RowGroupAdapter(var list: MutableList<RowGroupItem>) : RecyclerView.Adapter<RowGroupAdapter.RowGroupViewHolder>() {


    class RowGroupViewHolder(inflater: LayoutInflater , parent: ViewGroup) : RecyclerView.ViewHolder(inflater?.inflate(R.layout.row_group_item,parent,false)){
        private var RowGroupName: TextView? = null;
        private var RowGroupInnerRV: RecyclerView? = null;

        init {
            RowGroupName = itemView.findViewById(R.id.RowGroupName);
            RowGroupInnerRV = itemView.findViewById(R.id.RowGroupInnerRV);
        }

        fun bind(rowGroupItem: RowGroupItem){
            RowGroupName?.text=rowGroupItem.groupeName
            var adapter : RowItemAdapter = RowItemAdapter(rowGroupItem.list)
            RowGroupInnerRV?.adapter = adapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGroupViewHolder {
        var inflater = LayoutInflater.from(parent.context);
        return RowGroupViewHolder(inflater,parent);
    }

    override fun onBindViewHolder(holder: RowGroupViewHolder, position: Int) {
        var rowGroupItem = list[position]
        holder.bind(rowGroupItem);
    }

    override fun getItemCount(): Int {
        return list.size
    }

}