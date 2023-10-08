package com.myqr.study01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myqr.study01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b= ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.tvTest.text="aaaa"


    }
}