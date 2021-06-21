package com.spacecraft.github.helloandroid2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.spacecraft.github.helloandroid2021.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btnLogin.setOnClickListener {
            updateTextContent()
        }
    }

    private fun updateTextContent() {
        binding.apply {
            tvWelcome.text = randomText()

        }
    }

    private fun randomText():String{
        var texts = arrayOf("one","two","three","four","five","six","seven","eight","nine","ten")
        var random = Random()
        val index = random.nextInt(10)
        Log.d("MainActivity","index:$index")
        return texts[index]
    }
}

