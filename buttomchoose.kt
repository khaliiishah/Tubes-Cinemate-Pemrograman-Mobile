package com.example.tubescinema

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.tubescinema.databinding.ActivityButtomchooseBinding
import com.example.tubescinema.databinding.ActivityMadafBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarItemView

class buttomchoose : AppCompatActivity() {

    private lateinit var binding : ActivityButtomchooseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButtomchooseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(homepage())

        binding.buttomNav.setOnItemSelectedListener{
           when(it.itemId){
               R.id.nav_home -> replaceFragment(homepage())
               R.id.nav_food -> replaceFragment(food())
               R.id.nav_account -> replaceFragment(account())

               else ->{

               }

           }
            true
        }

    }

    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container,fragment)
        fragmentTransaction.commit()
    }
}