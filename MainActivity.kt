package com.example.operaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultados()
    }
    fun resultados() {
        var juan = op()
        println(juan.suma(1, 3))
        println(juan.resta(1, 3))
        println(juan.multi(1, 3))
        println(juan.div(1, 3))
    }
}
