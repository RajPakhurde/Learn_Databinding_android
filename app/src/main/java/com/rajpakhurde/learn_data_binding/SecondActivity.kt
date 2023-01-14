package com.rajpakhurde.learn_data_binding

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.rajpakhurde.learn_data_binding.data_bindng_xml.StudentActivity
import com.rajpakhurde.learn_data_binding.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_second)

        binding.apply {
            btnStart.setOnClickListener {
                loadProgressBar()
            }

            btnNext.setOnClickListener {
                launchActivity2()
            }
        }
    }

    private fun loadProgressBar(){
        binding.apply {
            if (progressBar.visibility == View.GONE){
                progressBar.visibility = View.VISIBLE
                btnStart.text = "Stop"
            }
            else {
               progressBar.visibility = View.GONE
               btnStart.text = "Start"
            }
        }
    }

    private fun launchActivity2(){
        intent = Intent(this@SecondActivity,StudentActivity::class.java)
        startActivity(intent)
    }
}