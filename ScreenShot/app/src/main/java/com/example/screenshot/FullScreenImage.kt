package com.example.screenshot

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity

class FullScreenImage : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_screen_image)

        val imageView: ImageView = findViewById(R.id.fullscreen_image_view)
        imageView.setImageResource(R.drawable.image)
    }
}