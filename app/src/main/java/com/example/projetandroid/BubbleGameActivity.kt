package com.example.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.projetandroid.R
import kotlinx.android.synthetic.main.fragment_slideshow.*

class BubbleGameActivity : AppCompatActivity() {
    //var nbBubbleTxt = findViewById(R.id.nbBubbleText) as TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_slideshow)
        //println("nb bubble: "+ nbBubbleTxt.text)
        //nbBubbleTxt.setText("nombre de bulle : "+com.example.projetandroid.CustomView.DELTA).toString()
        //nbBubbleTxt.text = "nombre de bulle : "+com.example.projetandroid.CustomView.).toString()
    }
    /*nbBubbleTxt.setOnClickListener {
        nbBubbleTxt.text = "hello"
        println("nb bubble: "+ nbBubbleTxt.text)
    }*/
}