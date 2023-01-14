package com.rajpakhurde.learn_data_binding.data_bindng_xml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.rajpakhurde.learn_data_binding.R
import com.rajpakhurde.learn_data_binding.databinding.ActivityStudentBinding

class StudentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_student)
        binding.student = getStudentData()

    }

    private fun getStudentData(): Students {
        return Students(1,"Alex","alex@gmail.com")
    }
}