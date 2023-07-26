package org.d3if0052.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextButton: Button = findViewById(R.id.nextButton)
        nextButton.setOnClickListener { showNext() }
    }
    private fun showNext() {
        Log.d("MainActivity", "Tombol diklik!")
    }
}