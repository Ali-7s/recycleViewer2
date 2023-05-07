package com.example.myfirstapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, "", duration)

        binding.numberTextView.setTextColor(ContextCompat.getColor(this, android.R.color.white))
        binding.numberTextView.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_purple))
        binding.button2.text = getString(R.string.TOASTY)

        binding.button2.setOnClickListener {
            binding.numberTextView.text = getString(R.string.BIGTOAST)
            toast.setText("ITS TOASTY")
            toast.show()
        }
    }
}
