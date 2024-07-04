package com.example.recyclerviewinfragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gfg.Employee

class Adapter(private val emplist: ArrayList<Employee>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.list_items, parent, false)
            return MyViewHolder(itemView)
        }
        override fun getItemCount(): Int {
            return emplist.size
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            val currentEmp = emplist[position]
            holder.name.text = currentEmp.name

            holder.address.text = currentEmp.address
            holder.number.text = currentEmp.number

        }

        class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val name: TextView = itemView.findViewById(R.id.tvName)

            val address: TextView = itemView.findViewById(R.id.tvAdress)
            val number: TextView = itemView.findViewById(R.id.tvNumber)


        }
    }

