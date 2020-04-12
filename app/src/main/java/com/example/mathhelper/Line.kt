package com.example.mathhelper

import android.os.Bundle
import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_line.*

class Line : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_line)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val back = Intent(this, MainActivity::class.java)
        startActivity(back)
        finish()
    }

    var H : String = ""
    var div : Boolean = false
    var A1 = 0
    var B1 = 0
    var C1 = 0
    var D1 = 0
    var E1 = 0
    var A2 = 0
    var B2 = 0
    var C2 = 0
    var D2 = 0
    var E2 = 1

    fun button0(view: View){
        if (result.text.toString() == "0")
            result.text = "0"
        else {
            result.text = (result.text.toString() + "0")
            H += "0"
        }
    }

    fun button1(view: View){
        if (result.text.toString() == "0")
            result.text = "1"
        else {
            result.text = (result.text.toString() + "1")
            H += "1"
        }
    }

    fun button2(view: View){
        if (result.text.toString() == "0")
            result.text = "2"
        else {
            result.text = (result.text.toString() + "2")
            H += "2"
        }
    }

    fun button3(view: View){
        if (result.text.toString() == "0")
            result.text = "3"
        else {
            result.text = (result.text.toString() + "3")
            H += "3"
        }
    }

    fun button4(view: View){
        if (result.text.toString() == "0")
            result.text = "4"
        else {
            result.text = (result.text.toString() + "4")
            H += "4"
        }
    }

    fun button5(view: View){
        if (result.text.toString() == "0")
            result.text = "5"
        else {
            result.text = (result.text.toString() + "5")
            H += "5"
        }
    }

    fun button6(view: View){
        if (result.text.toString() == "0")
            result.text = "6"
        else {
            result.text = (result.text.toString() + "6")
            H += "6"
        }
    }

    fun button7(view: View){
        if (result.text.toString() == "0")
            result.text = "7"
        else {
            result.text = (result.text.toString() + "7")
            H += "7"
        }
    }

    fun button8(view: View){
        if (result.text.toString() == "0")
            result.text = "8"
        else {
            result.text = (result.text.toString() + "8")
            H += "8"
        }
    }

    fun button9(view: View){
        if (result.text.toString() == "0")
            result.text = "9"
        else {
            result.text = (result.text.toString() + "9")
            H += "9"
        }
    }

    fun buttonPlus(view: View){
        if (result.text.toString() == "0")
            result.text = "+"
        else {
            result.text = (result.text.toString() + "+")
            if (H != "") {
                if (!div) {
                    E1 = H.toInt()
                    H = ""
                }
                else {
                    E2 = H.toInt()
                    H = ""
                }
            }
        }
    }

    fun buttonMin(view: View){
        if (result.text.toString() == "0")
            result.text = "-"
        else {
            result.text = (result.text.toString() + "-")
            if (H != "") {
                if (!div) {
                    E1 = H.toInt()
                    H = ""
                }
                else {
                    E2 = H.toInt()
                    H = ""
                }
            }
        }
    }

    fun buttonMul(view: View){
        if (result.text.toString() == "0")
            result.text = "*"
        else
            result.text = (result.text.toString() + "*")
    }

    fun buttonDel(view: View){
        if (result.text.toString() == "0")
            result.text = "/"
        else {
            result.text = (result.text.toString() + "/")
            div = true
        }
    }

    fun buttonSqrt(view: View){
        if (result.text.toString() == "0")
            result.text = "x^(1/2)"
        else {
            result.text = (result.text.toString() + "x^(1/2)")
            if (!div) {
                if(H != "")
                    A1 = H.toInt()
                else
                    A1 = 1
                H = ""
            }
            else {
                if(H != "")
                    A2 = H.toInt()
                else
                    A2 = 1
                H = ""
            }
        }
    }

    fun buttonx(view: View){
        if (result.text.toString() == "0")
            result.text = "x"
        else {
            result.text = (result.text.toString() + "x")
            if (!div) {
                if(H != "")
                    B1 = H.toInt()
                else
                    B1 = 1
                H = ""
            }
            else {
                if(H != "")
                    B2 = H.toInt()
                else
                    B2 = 1
                H = ""
            }
        }
    }

    fun buttonx2(view: View){
        if (result.text.toString() == "0")
            result.text = "x^2"
        else {
            result.text = (result.text.toString() + "x^2")
            if (!div) {
                if(H != "")
                    C1 = H.toInt()
                else
                    C1 = 1
                H = ""
            }
            else {
                if(H != "")
                    C2 = H.toInt()
                else
                    C2 = 1
                H = ""
            }
        }
    }

    fun buttonx3(view: View){
        if (result.text.toString() == "0")
            result.text = "x^3"
        else {
            result.text = (result.text.toString() + "x^3")
            if (!div) {
                if(H != "")
                    D1 = H.toInt()
                else
                    D1 = 1
                H = ""
            }
            else {
                if(H != "")
                    D2 = H.toInt()
                else
                    D2 = 1
                H = ""
            }
        }
    }

    fun buttonOpen(view: View){
        if (result.text.toString() == "0")
            result.text = "("
        else
            result.text = (result.text.toString() + "(")
    }

    fun buttonClose(view: View){
        if (result.text.toString() == "0")
            result.text = ")"
        else
            result.text = (result.text.toString() + ")")
    }

    fun buttonEql(view: View){

        if (H != "") {
            if (!div) {
                E1 = H.toInt()
                H = ""
            }
            else {
                E2 = H.toInt()
                H = ""
            }
        }

        val intent = Intent(this, Paper::class.java)
        H = "График f(x) = " + result.text.toString()
        intent.putExtra("h", H)
        intent.putExtra("a1", A1)
        intent.putExtra("b1", B1)
        intent.putExtra("c1", C1)
        intent.putExtra("d1", D1)
        intent.putExtra("e1", E1)
        intent.putExtra("a2", A2)
        intent.putExtra("b2", B2)
        intent.putExtra("c2", C2)
        intent.putExtra("d2", D2)
        intent.putExtra("e2", E2)
        startActivity(intent)
        finish()
    }

    fun buttonBack(view: View){
        val str = result.text.toString()
        if (str.isNotEmpty()){
            result.text = str.substring(0,str.length -1)
        }
    }

    fun buttonC(view: View){
        result.text = ""
    }
}