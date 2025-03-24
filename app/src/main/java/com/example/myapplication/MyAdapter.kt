package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val examList: List<ExamItem>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.exam_card, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val examItem = examList[position]

        holder.examName.text = examItem.examName
        holder.examDate.text = examItem.examDate
        holder.examMessage.text = examItem.examMessage

        if(examItem.examPic != null)
            holder.examPic.setImageResource(examItem.examPic!!)

        if(examItem.examPic2 != null)
            holder.examPic2.setImageResource(examItem.examPic2!!)
    }

    override fun getItemCount(): Int {
        return examList.size
    }

    // ViewHolder class
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val examName: TextView = itemView.findViewById(R.id.examName)
        val examDate: TextView = itemView.findViewById(R.id.examDate)
        val examMessage: TextView = itemView.findViewById(R.id.examMessage)
        val examPic: ImageView = itemView.findViewById(R.id.examPic)
        val examPic2: ImageView = itemView.findViewById(R.id.examPic2)
    }
}