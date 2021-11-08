package com.example.notificationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notificationapp.databinding.ActivityNotifiactionBinding

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNotifiactionBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}