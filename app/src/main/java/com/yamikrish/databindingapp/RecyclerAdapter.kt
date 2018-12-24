package com.yamikrish.databindingapp

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.yamikrish.databindingapp.BR
import com.yamikrish.databindingapp.R
import com.yamikrish.databindingapp.databinding.RecyclerItemBinding
import com.yamikrish.databindingapp.model.User

class RecyclerRAdapter(var context: Context, var list: ArrayList<User>) : RecyclerView.Adapter<RecyclerRAdapter.ViewHolder>() {

    // Inflating Layout and ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerRAdapter.ViewHolder {
        val binding: RecyclerItemBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.recycler_item, parent, false)
        return RecyclerRAdapter.ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    // Bind data
    override fun onBindViewHolder(holder: RecyclerRAdapter.ViewHolder, position: Int) {
        holder.bind(list.get(position))
    }

    // Creating ViewHolder
    class ViewHolder(val binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Any) {
            binding.setVariable(BR.user, data) //BR - generated class; BR.user - 'user' is variable name declared in layout
            binding.executePendingBindings()
        }
    }

}
