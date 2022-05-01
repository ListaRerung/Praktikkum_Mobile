package com.example.modul4.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.modul4.R
import com.example.modul4.model.JobSosial
import com.example.modul4.ui.jobsosial.JobSosialViewModel
import com.example.modul4.ui.jobsosial.JobsosialFragment

class JobsosialAdapter(
    private val context: Context,
    private val sosialArrayList: List<JobSosial>
): RecyclerView.Adapter<JobsosialAdapter.ItemViewHolder>() {
    private val viewModel = JobSosialViewModel()


    class ItemViewHolder(val view: View):RecyclerView.ViewHolder(view) {
        val NamaJobtextView: TextView = view.findViewById(R.id.namajobsosial)
        val imagesosial: ImageView = view.findViewById(R.id.gambarsosial)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder{
        val adapterSosialLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_sosial,parent,false)
        return ItemViewHolder(adapterSosialLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = sosialArrayList[position]
        holder.NamaJobtextView.text= context?.resources.getString(item.namasosial)
        holder.imagesosial.setImageResource(item.gambarsosial)
        holder.view.setOnClickListener {
            Toast.makeText(context, "Anda telah memilih item no. ${position+1}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return sosialArrayList.size
    }
}