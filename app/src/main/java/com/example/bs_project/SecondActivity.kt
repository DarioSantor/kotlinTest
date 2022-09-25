package com.example.bs_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("EXTRA_NAME")
        val nameString: String = "Hello $name!"

        nameTV.text = nameString

        closeBTN.setOnClickListener {
            val message: String = messageET.text.toString()
            Intent(this, MainActivity::class.java).also {
                it.putExtra("EXTRA_MESSAGE", message)
                startActivity(it)
            }
        }
    }
}