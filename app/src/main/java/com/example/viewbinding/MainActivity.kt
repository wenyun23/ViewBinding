package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

//ViewBinding在kotlin中的使用
class MainActivity : AppCompatActivity() {
    //延迟初始化lateinit var
    private lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);
        binding.textView1.text="kotlin";
        binding.textView2.text="viewBinding";
    }
}