package com.example.demokotlinawk

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btShare)

        btn.setOnClickListener {

            val msg : String = "asdf"
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,msg)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,"Select your Apk"))

        }

    }
}