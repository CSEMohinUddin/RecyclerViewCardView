package com.example.recyclerviewcardview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class RecycleAdpter(val Data:ArrayList<DataSetItemView>) : RecyclerView.Adapter<RecycleAdpter.RecycleViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecycleViewHolder {
        val v= LayoutInflater.from(p0.context).inflate(R.layout.item_view,p0,false)
        return RecycleViewHolder(v)
    }

    override fun getItemCount(): Int {
         return Data.size
    }

    override fun onBindViewHolder(p0: RecycleViewHolder, p1: Int) {
        val data:DataSetItemView=Data[p1]

        p0.text.text=data.Text
        p0.image.setImageResource(data.Image)
        p0.text2.text=data.Text2

    }

    public class RecycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image=itemView.findViewById<ImageView>(R.id.ivImage)
        val text=itemView.findViewById<TextView>(R.id.tvLineOne)
        val text2=itemView.findViewById<TextView>(R.id.tvLineTwo)

    }
}