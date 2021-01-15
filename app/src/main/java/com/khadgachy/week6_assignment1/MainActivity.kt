package com.khadgachy.week6_assignment1

import com.khadgachy.week6_assignment1.fragments.UploadFragment
import com.khadgachy.week6_assignment1.fragments.ViewFragment
import com.khadgachy.week6_assignment1.fragments.WebFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.khadgachy.week6_assignment1.models.add

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigation: BottomNavigationView = findViewById(R.id.dropdown)
        val home = ViewFragment()
        val upload = UploadFragment()
        val about = WebFragment()
        add()
        displayThisAsCurrentFragment(home)

        navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> displayThisAsCurrentFragment(home)
                R.id.upload -> displayThisAsCurrentFragment(upload)
                R.id.about -> displayThisAsCurrentFragment(about)
            }
            true
        }
    }

    private fun displayThisAsCurrentFragment(fragments: Fragment) =
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.viewpager, fragments)
                addToBackStack(null)
                commit()
            }
}