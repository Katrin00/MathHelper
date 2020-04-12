package com.example.mathhelper

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val eql: RecyclerView? = null
    private val adapter: BdAdapter? = null
    private val b: Button? = null
    var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        this.finish()
    }

    fun buttonGraph(view: View){
        startActivity(Intent(this, Line::class.java))
        finish()
    }

    fun buttonBD(view: View){
        startActivity(Intent(this, Line::class.java))
        finish()
    }
}