package com.zadania.kotlin_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

public var n = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val text1 = findViewById<TextView>(R.id.text1)
        val text2 = findViewById<TextView>(R.id.text2)
        btn1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                btn1.setText(n.toString())
                n += 1
            }
        })
        btn2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                n=0
                btn1.setText("Нажмите")
            }
        })
        val Fruit0 = Fruit("Яблоко", 10)
        text1.setText("Фрукт: " + Fruit0.name.toString() + ", кол-во: " + Fruit0.number.toString())
        val fruitData = Fruits.getFruit()
        text2.setText(fruitData.toString())
    }

    data class Fruit(val name: String, val number: Int)

}


