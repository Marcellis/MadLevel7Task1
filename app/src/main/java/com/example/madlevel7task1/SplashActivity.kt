package com.example.madlevel7task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Use Handler to wait 1 second before opening the MainActivity.
        Handler().postDelayed({
            startActivity(
                Intent(
                    this@SplashActivity,
                    MainActivity::class.java
                )
            )
            finish()
        }, 1000)

    }
}