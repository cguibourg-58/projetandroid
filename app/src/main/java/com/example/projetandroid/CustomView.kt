package com.example.projetandroid

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
//import android.widget.EditText
//import com.example.projetandroid.R
//import android.R.id
import android.widget.TextView
import com.example.projetandroid.R
import kotlinx.android.synthetic.main.fragment_bubble.*


class CustomView: View, OnTouchListener {
    private var mPaint = Paint()
    lateinit var mCircle: Bubble
    var bubbleArray = mutableListOf<Bubble>()
    var nbBubble = 0
    //val nbBubbleTextView = findViewById<TextView>(R.id.nbBubbleText)
    constructor(context: Context) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs){
        init()
    }
    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bot: Int) {
        super.onLayout(changed, left, top, right, bot)
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        //
        var m = Bubble(width, height)
        m.cx = event!!.x
        m.cy = event!!.y
        m.initColor()
        bubbleArray.add(nbBubble, m)
        nbBubble++
        return super.onTouchEvent(event)
    }

    override fun onDraw(canvas: Canvas?) {
        for (bubble in bubbleArray){
            //println("boucle")
            bubble.move()
            canvas?.drawCircle(bubble.cx, bubble.cy, bubble.rad, bubble.cPaint)
        }
        invalidate()
    }

    private fun init() {
        super.setOnTouchListener(this)
    }

    companion object {
        val DELTA = 25
    }
}
