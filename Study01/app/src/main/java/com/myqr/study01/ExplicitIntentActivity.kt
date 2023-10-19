package com.myqr.study01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.myqr.study01.databinding.ActivityExplicitIntentBinding
import com.myqr.study01.databinding.ActivityIntentBinding

class ExplicitIntentActivity : AppCompatActivity() {
    private lateinit var ExplicitIntentActivityBind: ActivityExplicitIntentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ExplicitIntentActivityBind= ActivityExplicitIntentBinding.inflate(layoutInflater)
        setContentView(ExplicitIntentActivityBind.root)

        //결과값을 반환하지않는 인텐트실행
        ExplicitIntentActivityBind.StartActivityButton.setOnClickListener {
            val intent = Intent(this, ExplicitIntentActivity_01::class.java)
            startActivity(intent)
        }

        //ActivityResultLauncher자료형인 resultLauncher 변수선언
        var resultLauncher: ActivityResultLauncher<Intent>

        //변수 resultLauncher에 registerForActivityResult메소드를 활용해서 ActivityLauncher를 만
        resultLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()){ result ->
            // 서브 액티비티로부터 돌아올 때의 결과 값을 받아 올 수 있는 구문
            if (result.resultCode == RESULT_OK){

                val name = result.data?.getStringExtra("name") ?: "받은데이터없음"
                ExplicitIntentActivityBind.textView.setText(name)
            }
        }
        //결과값을 반환하는 인텐트실행
        ExplicitIntentActivityBind.startactivityforresultButton.setOnClickListener {
            val intent = Intent(this,ExplicitIntentActivity_02::class.java)
            resultLauncher.launch(intent)
        }

    }
}