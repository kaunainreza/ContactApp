package com.example.contactapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.contactapp.RecyclerContactAdapter.*

class RecyclerContactAdapter(val context: Context, val arrContact: ArrayList<ContactModel>) :
    RecyclerView
.Adapter<ViewHolder>(){


    class ViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
        val imgContact:ImageView = itemView.findViewById(R.id.imgContact)
        val txtName: TextView = itemView.findViewById(R.id.txtName)
        val txtNumber: TextView = itemView.findViewById(R.id.txtNumber)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false))
    }


    override fun getItemCount(): Int {
        return arrContact.size

    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.imgContact.setImageResource(arrContact[position].img)
        holder.txtName.text= arrContact[position].name
        holder.txtNumber.text= arrContact[position].number


    }


}