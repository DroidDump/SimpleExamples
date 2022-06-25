package com.example.simpleexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_send_name.setOnClickListener {
            val hello = getString(R.string.hello)
            val name = editTextName.text.toString().trim()
            "$hello, $name!".also { textView.text = it }
        }
    }
}
