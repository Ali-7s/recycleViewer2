package com.example.myfirstapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.databinding.ItemViewBinding

class MyAdapter(private val data: List<Int> = listOf()) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(val binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = DataBindingUtil.inflate<ItemViewBinding>(LayoutInflater.from(parent.context), R.layout.item_view, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.number = data[position].toString()
        holder.binding.executePendingBindings()
    }

    override fun getItemCount(): Int = data.size
}
