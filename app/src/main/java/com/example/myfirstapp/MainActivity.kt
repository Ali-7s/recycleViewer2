package com.example.myfirstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val rv = binding.recycleView
        rv.layoutManager = LinearLayoutManager(this)

       val favShowsOrMovies =  listOf("Death Note", "Peaky Blinders", "Dark", "LOST", "Locked Up", "Money Heist","MindHunter", "Ozark", "91 Days", "Ju-On Origins", "The Haunting of Hill House", "Attack on Titan", "Jujutsu Kaisen", "What Happened To Monday", "The Platform", "The Witch: Part 1 - Subversion", "The Call", "Forgotten")
        rv.adapter = MyAdapter(favShowsOrMovies)

    }
}
