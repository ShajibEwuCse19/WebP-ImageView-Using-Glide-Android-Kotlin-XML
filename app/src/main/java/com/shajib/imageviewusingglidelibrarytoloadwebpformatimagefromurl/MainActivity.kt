package com.shajib.imageviewusingglidelibrarytoloadwebpformatimagefromurl

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.ivImage)
        val imageUrl = "https://www.gstatic.com/webp/gallery/1.webp"

        Glide.with(this)
            .load(imageUrl)
            .into(imageView)
    }
}