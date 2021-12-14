package com.example.healther

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healther.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonLogInLogin.setOnClickListener {
            val email = binding.editTextLoginEmail.text.toString()
            val password = binding.editTextLoginPassword.text.toString()
            val valid = Validator(this)
            binding.inputLayoutLoginEmail.error = valid.validatorEmail(email)
            binding.inputLayoutLoginPassword.error = valid.validatorPassword(password)
            if (binding.inputLayoutLoginEmail.error.isNullOrBlank() &&
                binding.inputLayoutLoginPassword.error.isNullOrBlank()
            ) {
                val intentHome = Intent(this, HomeActivity::class.java)
                intentHome.putExtra("Email", email)
                startActivity(intentHome)
            }
        }
        binding.textLoginBottomLink.setOnClickListener {
            val intentSignup = Intent(this, SignUpActivity::class.java)
            startActivity(intentSignup)
        }
    }
}
