package com.example.belajarstyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val btnSayHello = findViewById<Button>(R.id.btnSayHello)
        val etwelcome = findViewById<EditText>(R.id.etwelcome)

        btnSayHello.setOnClickListener {
            val name = etName.text.toString()
            etwelcome.setText("irwan gaming $name")
        }



    }
}