package com.zadania.kotlin_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.btn1)
        btn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                btn.setText("Нажато")
                    //      TODO("Not yet implemented")
            }
        })
    }
}


