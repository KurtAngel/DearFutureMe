package com.example.dearfutureme

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dearfutureme.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

//        initVars()
        createAcc()
//        logInAcc()
    }

//    private fun initVars() {
//        TODO("Not yet implemented")
//    }

    private fun createAcc() {
        binding.createAccount.setOnClickListener {
            startActivity(Intent(this@MainActivity, SignupUi::class.java))
        }
    }

//    private fun logInAcc() {
//        TODO("Not yet implemented")
//    }

}