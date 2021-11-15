package com.example.arrays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var array: ArrayList<String> = ArrayList()

    lateinit var firstNumber: EditText
    lateinit var symbol: EditText
    lateinit var secondNumber: EditText
    lateinit var button: Button
    lateinit var result: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumber=findViewById(R.id.firstNumber)
        symbol=findViewById(R.id.symbol)
        secondNumber=findViewById(R.id.secondNumber)
        button=findViewById(R.id.resultBtn)
        result=findViewById(R.id.textView)

        button.setOnClickListener {
            result.text=getResult()
        }
    }
    fun getResult():String {
        val a = firstNumber.text.toString().toInt()
        val b = secondNumber.text.toString().toInt()
        val s = symbol.text.toString()

        if (s == "+")
        {
            return (a + b).toString()
        }
        if (s == "-")
        {
            return (a - b).toString()
        }
        if (s == "*")
        {
            return (a * b).toString()
        }
        if (s == "/")
        {
            return (a / b).toString()
        }

        if (s == "<")
        {
            return (a < b).toString()
        }

        if (s == ">")
        {
            return (a > b).toString()
        }

        if (s == "=")
        {
            return (a == b).toString()
        }
        return "Нет результата"
    }
    }



