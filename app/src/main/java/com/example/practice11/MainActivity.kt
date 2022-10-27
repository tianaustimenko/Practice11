package com.example.practice11

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("ResourceType")
    fun onMyButtonClick(view: View?) {
        val photo: ImageView = findViewById(R.id.imageView2)
        val imageView:Int = R.drawable.pear
        photo.setImageResource(imageView)
    }
}
