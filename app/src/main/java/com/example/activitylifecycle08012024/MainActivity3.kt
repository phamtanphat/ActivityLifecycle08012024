package com.example.activitylifecycle08012024

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {

    private lateinit var btnNavigateMain3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnNavigateMain3 = findViewById(R.id.button_navigate_main3)
        btnNavigateMain3.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }

        Log.d("pphat", "Main3: onCreate")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("pphat", "Main3: onNewIntent")
    }

    override fun onStart() {
        super.onStart()
        Log.d("pphat", "Main3: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("pphat", "Main3: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pphat", "Main3: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("pphat", "Main3: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("pphat", "Main3: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("pphat", "Main3: onDestroy")
    }
}