package com.khadgachy.week6_assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    private lateinit var etusername: EditText
    private lateinit var etpassword: EditText
    private lateinit var btnlog: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etusername = findViewById(R.id.etUsername)
        etpassword = findViewById(R.id.etPassword)
        btnlog = findViewById(R.id.btnLogIn)
        btnlog.setOnClickListener {
            if (validate()) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun validate(): Boolean {
        when {
            TextUtils.isEmpty(etusername.text) -> {
                etusername.error = "Username cannot be empty so, enter the valid username."
                etusername.requestFocus()
                return false
            }
            etusername.text.toString() != "softwarica" -> {
                etusername.error = "Inputted Username is incorrect."
                etusername.requestFocus()
                return false
            }
            TextUtils.isEmpty(etpassword.text) -> {
                etpassword.error = "Password cannot be empty so, enter the password."
                etpassword.requestFocus()
                return false
            }
            etpassword.text.toString() != "coventry" -> {
                etpassword.error = "Inputted password is incorrect."
                etpassword.requestFocus()
                return false
            }
            else -> return true
        }

    }
}