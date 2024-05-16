package com.example.mypagetalk.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mypagetalk.R

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//      enableEdgeToEdge()
        setContentView(R.layout.activity_join)
//      ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//          val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//          v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//          insets
//      }
    }
}