package com.myqr.study01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myqr.study01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b= ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.ButtonIntent.setOnClickListener {
            var intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }
        b.ButtonBundle.setOnClickListener {
            var intent=Intent(this,BundleActivity::class.java)
            startActivity(intent)
        }
        b.ButtonFragment.setOnClickListener {
            var intent=Intent(this,FragmentActivity::class.java)
            startActivity(intent)
        }



    }
}