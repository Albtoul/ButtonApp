package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var show:TextView
    private lateinit var add:Button
    private lateinit var substract:Button
    var x=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show = findViewById(R.id.text)
        add=findViewById(R.id.button)
        substract=findViewById(R.id.button2)


        add.setOnClickListener { Subfun()
           }
        substract.setOnClickListener {Addfun()

        }


    }

   private fun Addfun(){
        x++
    show.text = x.toString()

}

    private fun Subfun(){
        x--
        show.text= x.toString()


    }



}