package com.example.sample08startactivityforresult

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sample08startactivityforresult.databinding.SecondActivityBinding

class ActivitySecond : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        SecondActivityBinding.inflate(layoutInflater, null, false)
            .also { setContentView(it.root) }
            .apply {
                textView.text = intent.getStringExtra(KEY_TRANSFER)
            }
    }

    companion object {
        const val KEY_TRANSFER = "key_transfer"
    }
}