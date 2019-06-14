package com.example.pockemgame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        main_start_button.setOnClickListener {
            Log.d("MapsActivity", "Try show Maps activity")
            //Lounch Maps activity somehow
            val intent = Intent(this, MapsActivity::class.java)

            startActivity(intent)
        }




    }


}
