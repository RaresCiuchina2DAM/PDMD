package com.example.pdmd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 0
    private var onResume = 0
    private var onPause = 0
    private var onStop = 0
    private var onDestroy = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("OnCreate $onCreate")
    }

//    capturar el estado de la aplicacion
    override fun onStart() {
        super.onStart()
        println("OnStart $onStart")
        onStart++
    }
    override fun onResume() {
        super.onResume()
        println("OnResume $onResume")
        onResume++
    }
    override fun onPause() {
        super.onPause()
        println("OnPause $onPause")
        onPause++
    }
    override fun onStop() {
        super.onStop()
        println("OnStop $onStop")
        onStop++
    }
    override fun onDestroy() {
        super.onDestroy()
        println("OnDestroy $onDestroy")
        onDestroy++
    }



}