package com.example.olshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SystemClock.sleep(2000)
        val intent  = Intent(this,LoginActivity::class.java)
        startActivity(intent)
        finish()

    }
}
