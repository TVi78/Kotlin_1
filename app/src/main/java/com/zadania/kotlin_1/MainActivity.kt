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
        val text3 = findViewById<TextView>(R.id.text3)
        val text4 = findViewById<TextView>(R.id.text4)
        val text5 = findViewById<TextView>(R.id.text5)
        val text6 = findViewById<TextView>(R.id.text6)
        btn1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                btn1.setText(n.toString())
                n += 1
            }
        })
        btn2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                n = 0
                btn1.setText("Нажмите")
                if (n == 5) {
                    text3.setText("Ура, n равно " + n)
                } else text3.setText("n равно " + n)
            }
        })
        val Fruit0 = Fruit("Яблоко", 10)
        val fruitData = Fruits.getFruit()
        val n = Animal1.Dog
        text1.setText("Фрукт: " + Fruit0.name.toString() + ", кол-во: " + Fruit0.number.toString())
        text2.setText(fruitData.toString())
        text4.setText("Кот " + Animal.Cat.animalName + " и собака " + Animal.Dog.animalName)

        when {
            Animal1.Cat == n -> text5.setText("Животное - кот")
            Animal1.Dog == n -> text5.setText("Животное - собака")
        }

        var k = 0
        for (i in 1..5) {
            k += i
            text6.setText(k.toString())
        }
    }

    data class Fruit(val name: String, val number: Int)

    enum class Animal(val animalName: String) {
        Cat("Васька"),
        Dog("Бобик")
    }

    enum class Animal1 {
        Cat,
        Dog
    }
}


