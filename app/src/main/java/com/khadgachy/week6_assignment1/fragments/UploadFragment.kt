package com.khadgachy.week6_assignment1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import com.khadgachy.week6_assignment1.R
import com.khadgachy.week6_assignment1.models.Students
import com.khadgachy.week6_assignment1.models.adapter
import com.khadgachy.week6_assignment1.models.listStudent

class UploadFragment : Fragment(){

    private lateinit var etname: EditText
    private lateinit var etage: EditText
    private lateinit var etadd: EditText
    private lateinit var btnsubmit: Button
    private lateinit var rgbtn: RadioGroup
    private lateinit var gender: String
    private lateinit var image: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_upload, container, false)
        etname = view.findViewById(R.id.etName)
        etage = view.findViewById(R.id.etAge)
        rgbtn = view.findViewById(R.id.rgBtn)
        etadd = view.findViewById(R.id.etAdd)
        btnsubmit = view.findViewById(R.id.btnSubmit)
        btnsubmit.setOnClickListener {
            if (upload()) {
                radiogroup()
                Toast.makeText(context,"The user is added.",Toast.LENGTH_SHORT).show()
                clear()
            }
        }
        return view
    }

    private fun upload(): Boolean {
        val name = etname.text.toString()
        val age = etage.text.toString()
        val gender = rgbtn.isSelected.toString()
        val address = etadd.text.toString()
        if (name.isBlank() || age.isBlank() || gender.isBlank() || address.isBlank()) {
            etname.error = "Full Name must not be empty."
            etname.requestFocus()
            etadd.error = "Address must not be empty."
            etadd.requestFocus()
            etage.error = "Age must not be empty."
            etage.requestFocus()
        }
        return true
    }

    private fun clear(){
        etname.setText("")
        etage.setText("")
        etadd.setText("")
        rgbtn.clearCheck()

    }

    private fun radiogroup() {
        val id = rgbtn.checkedRadioButtonId
        when(id){
            R.id.rbMale -> gender = "Male"
            R.id.rbFemale -> gender = "Female"
            R.id.rbOthers -> gender = "Other"
        }
        if (gender == "Male"){
            image = "https://cdn.onlinewebfonts.com/svg/img_504768.png"
        }
        if(gender == "Female"){
            image = "https://www.pngitem.com/pimgs/m/110-1104775_user-woman-business-woman-png-icon-transparent-png.png"
        }
        if (gender == "Other")
        {
            image = "https://img.icons8.com/cotton/2x/Gender.png"
        }
        val name = etname.text.toString()
        val age = etage.text.toString().toInt()
        val address = etadd.text.toString()
        listStudent.add(Students(name, age, "$gender","$address","$image"))
        adapter.notifyDataSetChanged()


    }
}