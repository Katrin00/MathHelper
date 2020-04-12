package com.example.mathhelper

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Paper : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        var h = intent.getStringExtra("h")

        var a1 = intent.getIntExtra("a1", 0)
        var b1 = intent.getIntExtra("b1", 0)
        var c1 = intent.getIntExtra("c1", 0)
        var d1 = intent.getIntExtra("d1", 0)
        var e1 = intent.getIntExtra("e1", 0)
        var a2 = intent.getIntExtra("a2", 0)
        var b2 = intent.getIntExtra("b2", 0)
        var c2 = intent.getIntExtra("c2", 0)
        var d2 = intent.getIntExtra("d2", 0)
        var e2 = intent.getIntExtra("e2", 1)

        super.onCreate(savedInstanceState)
        setContentView(Draw(this, a1, b1, c1, d1, e1, a2, b2, c2, d2, e2, h))
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val back = Intent(this, Line::class.java)
        startActivity(back)
        finish()
    }

    class Draw (context: Context, a1: Int, b1: Int, c1: Int, d1: Int, e1: Int,
                a2: Int, b2: Int, c2: Int, d2: Int, e2: Int, h: String) : View(context) {

        val h = h
        val a1 = a1
        val b1 = b1
        val c1 = c1
        val d1 = d1
        val e1 = e1
        val a2 = a2
        val b2 = b2
        val c2 = c2
        val d2 = d2
        val e2 = e2

        override fun onDraw(canvas: Canvas?) {
            canvas!!.drawRGB(255, 255, 255)
            val brush = Paint()
            val brush2 = Paint()
            val brush3 = Paint()
            val brush4 = Paint()
            brush.setARGB(255, 255, 0, 0)
            brush2.setARGB(200, 0, 0, 0)
            brush3.setARGB(255, 0, 0, 0)
            brush4.setARGB(255, 0, 0, 0)
            brush.strokeWidth = 5F
            brush2.strokeWidth = 5F
            brush3.strokeWidth = 10F
            brush4.textSize = 80F

            canvas!!.drawLine(40F, 540F, 1040F, 540F, brush3)
            canvas!!.drawLine(540F, 40F, 540F, 1040F, brush3)

            canvas.drawText(h, 40F, 1150F, brush4)

            for(i in 40..1040 step 50){
                canvas!!.drawLine(i.toFloat(), 40F, i.toFloat(), 1040F, brush2)
                canvas!!.drawLine(40F, i.toFloat(), 1040F, i.toFloat(), brush2)
            }

            var sign = -1F

            if((d1 == 0) && (c1 == 0) && (b1 == 0)){
                if(e1 > 0)
                    sign = -1F
                if(e1 < 0)
                    sign = 1F
            }

            if((d1 == 0) && (c1 == 0)){
                if(b1 > 0)
                    sign = -1F
                if(b1 < 0)
                    sign = 1F
            }

            if(d1 == 0){
                if(c1 > 0)
                    sign = -1F
                if(c1 < 0)
                    sign = 1F
            }

            if(d1 != 0){
                if(d1 > 0)
                    sign = -1F
                if(d1 < 0)
                    sign = 1F
            }

            var k = -540F

            while (k <= 540F) {

                var x = (k * 50F) + 540F
                var y = ( sign * ( ( (d1 * k * k * k) + (c1 * k * k) + (b1 * k) + (e1) )/
                        ( (d2 * k * k * k) + (c2 * k * k) + (b2 * k) + (e2) ) ) * 50F + 540F )

                if((x < 1040) && (x > 40) && (y > 40) && (y < 1040)) {
                    canvas!!.drawPoint(x, y, brush)
                }

                k += 0.0001F
            }
        }
    }
}