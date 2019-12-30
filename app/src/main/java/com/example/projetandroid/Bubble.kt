package com.example.projetandroid
import android.graphics.Color
import android.graphics.Color.argb
import android.graphics.Paint
import kotlin.math.roundToInt
import kotlin.random.Random

data class Bubble(val maxX: Int, val maxY: Int){
    var cx: Float = 50F
    var cy: Float = 50F
    var rad: Float = 60F
    var randomleftRight = listOf((CustomView.DELTA), -(CustomView.DELTA))
    var dx = randomleftRight.random()/2
    var dy = CustomView.DELTA
    val cPaint = Paint()
    //val arrayColor = listOf(Color.parseColor("0x80ff0000"))
    val arrayRad = listOf(40F, 40F, 40F, 70F, 80F, 100F, 50F, 50F, 60F)

    fun initColor() {
        //cPaint.color = arrayColor.random()
        cPaint.color = Color.BLUE
        cPaint.alpha = 108
        rad = arrayRad.random()
    }

    fun move() {
        when {
            cx !in (rad+1).roundToInt()..(maxX-rad-1).roundToInt() -> dx = -dx
            cy !in (rad+1).roundToInt()..(maxY-rad-1).roundToInt() -> dy = -dy
            /*cx !in 0..(rad).roundToInt() -> dy = +dy*/
        }
        cx -= dx
        cy -= dy
    }
}
