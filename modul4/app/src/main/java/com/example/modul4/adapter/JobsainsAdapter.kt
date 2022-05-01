package com.example.modul4.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import com.example.modul4.R
import com.example.modul4.model.JobSains
import com.example.modul4.ui.jobsains.JobsainsFragment

class JobsainsAdapter(
    private val context: Context,
    private val sainsArrayList: ArrayList<JobSains>
):RecyclerView.Adapter<JobsainsAdapter.ItemViewHolder>() {
    class ItemViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val namaJobSainstextView: TextView = view.findViewById(R.id.namajobsains)
        val gambarjobSains: ImageView = view.findViewById(R.id.gambarsains)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val jobsainsAdapterlayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_sains,parent,false)
        return ItemViewHolder(jobsainsAdapterlayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = sainsArrayList[position]
        holder.namaJobSainstextView.text = context?.resources.getString(item.namaSains)
        holder.gambarjobSains.setImageResource(item.gambarSains)
        holder.view.setOnClickListener {
            Toast.makeText(context, "Anda telah memilih item no. ${position+1}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return sainsArrayList.size
    }

}