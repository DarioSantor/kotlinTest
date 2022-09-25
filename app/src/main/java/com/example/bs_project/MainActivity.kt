package com.example.bs_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enterBTN.setOnClickListener {
            val name = nameET.text.toString()
            Intent(this, SecondActivity::class.java).also {
                it.putExtra("EXTRA_NAME", name)
                startActivity(it)
            }
        }

        val message = intent.getStringExtra("EXTRA_MESSAGE")

        if (message.isNullOrBlank()){
            welcomeTV.text = "WELCOME!!!"
        } else {
            welcomeTV.text = message
        }

        resetBTN.setOnClickListener {
            welcomeTV.text = "WELCOME!!!"
        }
    }
}