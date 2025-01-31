package com.example.activitylifecycle08012024

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnNavigateMain2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnNavigateMain2 = findViewById(R.id.button_navigate_main2)
        btnNavigateMain2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        Log.d("pphat", "Main: onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("pphat", "Main: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("pphat", "Main: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pphat", "Main: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("pphat", "Main: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("pphat", "Main: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("pphat", "Main: onDestroy")
    }
}