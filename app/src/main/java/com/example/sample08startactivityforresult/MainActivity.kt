package com.example.sample08startactivityforresult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sample08startactivityforresult.databinding.ActivityMainBinding
import java.util.UUID

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater, null, false)
            .also { setContentView(it.root) }
            .apply {
                button.setOnClickListener {
                    val intent = Intent(this@MainActivity, ActivitySecond::class.java)
                        .putExtra(ActivitySecond.KEY_TRANSFER, UUID.randomUUID().toString())
                    this@MainActivity.startActivity(intent)
                }
            }
    }
}