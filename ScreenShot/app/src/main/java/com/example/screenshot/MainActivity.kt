package com.example.screenshot
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, FullScreenImage::class.java)
            startActivity(intent)
        }

    }
}
