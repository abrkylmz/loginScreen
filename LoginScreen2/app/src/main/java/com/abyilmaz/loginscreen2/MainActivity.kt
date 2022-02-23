package com.abyilmaz.loginscreen2



import android.content.Intent

import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.abyilmaz.loginscreen2.databinding.ActivityMainBinding

//import com.google.android.gms.location.FusedLocationProviderClient
//import com.google.android.gms.location.LocationServices


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usernameLayout = findViewById<EditText>(R.id.username_layout)
        val passwordLayout = findViewById<EditText>(R.id.password_layout)
        val loginButton = findViewById<Button>(R.id.loginbtn)


        binding.loginbtn.setOnClickListener {

            val username2 = usernameLayout.text.toString()
            val password2 = passwordLayout.text.toString()

            Toast.makeText(applicationContext,"Login successful! ",Toast.LENGTH_LONG).show()

            intent = Intent(applicationContext, SecondScreen::class.java)
            intent.putExtra("Username", username2)
            intent.putExtra("Password", password2)

            startActivity(intent)
        }


        fun validateForm(username: String?, password: String?): Boolean {
            val isValidUsername = username?.length ?: 0 in 5..10 && username != null
            val isValidPassword = password?.length ?: 0 in 5..10 && password != null
            return isValidUsername && isValidPassword
        }

        //  fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)


        //checkLocationPermission()
    }

    //private fun checkLocationPermission() {
    // if(ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION
    //   != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this,)
    //   )
    //}
}

