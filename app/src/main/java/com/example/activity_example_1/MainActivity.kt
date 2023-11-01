package com.example.activity_example_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

//appcom is like a parent activity

class MainActivity : AppCompatActivity() {

    private val Tag="Activity_1"

    private  lateinit var button:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(Tag,"onCreate")

        button=findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))

        }


    }

    override fun onStart() {
        super.onStart()
        Log.e(Tag,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(Tag,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(Tag,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(Tag,"onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(Tag,"onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(Tag,"onDestroy")
    }

}