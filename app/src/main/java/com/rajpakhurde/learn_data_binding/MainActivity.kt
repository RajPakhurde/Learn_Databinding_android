package com.rajpakhurde.learn_data_binding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.rajpakhurde.learn_data_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.apply {
            btnSubmit.setOnClickListener {
                showGreetingMsg()
            }

            btnNext.setOnClickListener {
                launchActivity()
            }
        }


    }

    private fun showGreetingMsg(){
        binding.apply {
            tvGreetingMsg.text = "Hello " + etName.text
        }
    }

    private fun launchActivity(){
        intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }
}