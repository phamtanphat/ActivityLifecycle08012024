package com.example.activitylifecycle08012024

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var btnNavigateMain3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnNavigateMain3 = findViewById(R.id.button_navigate_main3)
        btnNavigateMain3.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        Log.d("pphat", "Main2: onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.d("pphat", "Main2: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("pphat", "Main2: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pphat", "Main2: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("pphat", "Main2: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("pphat", "Main2: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("pphat", "Main2: onDestroy")
    }
}