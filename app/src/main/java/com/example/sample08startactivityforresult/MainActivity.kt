package com.example.sample08startactivityforresult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sample08startactivityforresult.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater, null, false)
            .also { setContentView(it.root) }
            .apply {
                button.setOnClickListener {
                    val intent = Intent()
                }
            }

        with(binding) {
            button
        }
    }
}