package com.example.a7monthclasswork1.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.a7monthclasswork1.R
import com.example.a7monthclasswork1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()   {
    private lateinit var binding:ActivityMainBinding
    private lateinit var navController: NavController


override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
    navController = navHostFragment.navController

}}



//val navController = findNavController(R.id.nav_host_fragment_activity_main)
//val appBarConfiguration = AppBarConfiguration(
//    setOf(
//        R.id.firstFragment, R.id.secondFragment)
//)
//setupActionBarWithNavController(navController, appBarConfiguration)