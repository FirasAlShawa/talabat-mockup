package com.firasalshawa.talabat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GroupItemAdapter(var list: MutableList<GroupItem>) : RecyclerView.Adapter<GroupItemAdapter.GroupViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return GroupViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val group = list[position]
        holder.bind(group)
    }

    override fun getItemCount(): Int {
       return list.size
    }



    class GroupViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
        RecyclerView.ViewHolder(inflater.inflate(R.layout.group_item, parent, false)) {
        private var gName: TextView? = null


        init {
            gName = itemView.findViewById(R.id.groupName)
        }

        fun bind(group: GroupItem) {
            gName?.text = group.text
        }

    }

}