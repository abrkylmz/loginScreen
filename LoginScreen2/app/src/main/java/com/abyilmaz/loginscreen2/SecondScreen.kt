package com.abyilmaz.loginscreen2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
//import com.abyilmaz.loginscreen2.databinding.ActivitySecondScreenBinding



class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  val binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        var intent = intent
        val username2 = intent.getStringExtra("Username")

        //val secondScreen= findViewById<TextView>(R.id.WelcomeUser)
        //secondScreen.text= username2

        //binding.BackButton.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        //}


    }
}