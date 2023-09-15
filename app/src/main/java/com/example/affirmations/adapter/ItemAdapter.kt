package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class ItemAdapter(
    val context : Context,
    private val dataSet : List<Affirmation>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder(view) {
        val textView : TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        /**
         * getting a reference of layout-inflater and inflating
         * the list item view. This adapterLayout holds a reference to the
         * list item view(from which we can later find child views like TextView)
         *
         * */
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    /***
     * returning size of data set in getItemCount() method
     *
     * below expression is same as adding a return statement inside the function
     */
    override fun getItemCount() = dataSet.size
}