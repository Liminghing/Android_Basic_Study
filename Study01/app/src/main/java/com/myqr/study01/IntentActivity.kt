package com.myqr.study01

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.myqr.study01.databinding.ActivityIntentBinding
import com.myqr.study01.databinding.ActivityMainBinding

class IntentActivity : AppCompatActivity() {
    private lateinit var IntentActivityBind: ActivityIntentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        IntentActivityBind= ActivityIntentBinding.inflate(layoutInflater)
        setContentView(IntentActivityBind.root)
        //명시적인텐트버튼
        IntentActivityBind.ExplicitIntent.setOnClickListener {
            val intent = Intent(this, ExplicitIntentActivity::class.java)
            startActivity(intent)
        }
        //암시적인텐트버튼
        IntentActivityBind.SuggestiveIntent.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
            startActivity(intent)
        }
    }
}