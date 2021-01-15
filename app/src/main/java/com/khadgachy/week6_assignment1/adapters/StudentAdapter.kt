package com.khadgachy.week6_assignment1.adapters

import com.khadgachy.week6_assignment1.fragments.ViewFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.khadgachy.week6_assignment1.R
import com.bumptech.glide.Glide
import com.khadgachy.week6_assignment1.models.Students

class StudentAdapter(
var listStudent: ArrayList<Students>,
var context: ViewFragment
): RecyclerView.Adapter<StudentAdapter.AdapterViewHolder>() {
    class AdapterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name: TextView
        var age: TextView
        var address: TextView
        var gender: TextView
        var delete: ImageView
        var uploadimg: ImageView

        init {
            name = view.findViewById(R.id.tvName)
            age = view.findViewById(R.id.tvAge)
            address = view.findViewById(R.id.tvAddress)
            gender = view.findViewById(R.id.tvGender)
            delete = view.findViewById(R.id.ivDelete)
            uploadimg = view.findViewById(R.id.circularView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.individual_info, parent, false)
        return AdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        val student = listStudent[position]

        holder.name.text = student.Name
        holder.address.text = student.Age.toString()
        holder.age.text = student.Address
        holder.gender.text = student.Gender
        Glide.with(
                holder.itemView.context
        ).load(
                student.Image
        ).into(holder.uploadimg)
        holder.delete.setOnClickListener {
            listStudent.removeAt(position)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return com.khadgachy.week6_assignment1.models.listStudent.size
    }
}