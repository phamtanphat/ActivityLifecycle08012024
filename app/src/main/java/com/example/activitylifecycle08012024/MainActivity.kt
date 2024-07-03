package com.example.activitylifecycle08012024

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d("pphat", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("pphat", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("pphat", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pphat", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("pphat", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("pphat", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("pphat", "onDestroy")
    }
}