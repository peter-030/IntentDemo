package com.example.intentdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnA: Button = findViewById(R.id.btnA)
        btnA.setOnClickListener() {
            val intentA: Intent = Intent(
                this,
                Activity2::class.java
            )
            intentA.putExtra("StudentName", "Peter")
            startActivity(intentA)
        }

        val btnB: Button = findViewById(R.id.btnB)
        btnB.setOnClickListener() {
            //val telNo = Uri.parse("tel:911")
            //val intentB: Intent = Intent(Intent.ACTION_DIAL, telNo)
            val geo = Uri.parse("geo:3.140853, 101.693207")
            val intentB: Intent = Intent(Intent.ACTION_VIEW, geo)
            startActivity(intentB)
        }
    }
}