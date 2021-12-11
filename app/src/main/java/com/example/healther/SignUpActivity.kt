package com.example.healther
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healther.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSignUpLogin.setOnClickListener {
            val valid = Validator(this)
            val name = binding.editTextSignUpName.text.toString()
            val email = binding.editTextSignUpEmail.text.toString()
            val password = binding.editTextSignUpPassword.text.toString()
            binding.inputLayoutSignUpName.error = valid.validatorName(name)
            binding.inputLayoutSignUpEmail.error = valid.validatorEmail(email)
            binding.inputLayoutSignUpPassword.error = valid.validatorPassword(password)
            if(binding.inputLayoutSignUpEmail.error.isNullOrBlank() &&
                binding.inputLayoutSignUpEmail.error.isNullOrBlank() &&
                binding.inputLayoutSignUpPassword.error.isNullOrBlank())
                {
//                val intent = Intent(this, HomeActivity::class.java)
//                intent.putExtra("Email", email)
//                startActivity(intent)
                }
        }
        binding.textSignUpBottomLink.setOnClickListener {
            val intentLogin = Intent(this, LoginActivity::class.java)
            startActivity(intentLogin)

        }
    }
}