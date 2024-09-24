package com.example.dearfutureme

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.dearfutureme.databinding.ActivitySignupuiBinding

class SignupUi : AppCompatActivity() {

    private lateinit var binding: ActivitySignupuiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignupuiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loginAcc()
    }

    private fun loginAcc() {
        binding.loginAccount.setOnClickListener {
            startActivity(Intent(this@SignupUi, MainActivity::class.java))
        }
    }
}