package com.myqr.study01

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ExplicitIntentActivity_02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent02)
        val returnIntent: Intent = intent
        intent.putExtra("name","리턴받은 데이터")
        setResult(Activity.RESULT_OK, returnIntent)
    }
}