package com.example.alertdialog

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//title,message,positivebutton,negativebutton, neutralbutton, cancelable,icon

          button = findViewById(R.id.btn)

        val alert = AlertDialog.Builder(this)

        alert.setIcon(R.drawable.ic_launcher_foreground)
        alert.setTitle("Alert Message")
        alert.setMessage("Enter a valid username or password")
        alert.setPositiveButton("Yes"){dialog, which->
            Toast.makeText(this,"Yes",Toast.LENGTH_SHORT).show()
        }
        alert.setNegativeButton("No"){dialog, which->
            Toast.makeText(this,"No",Toast.LENGTH_SHORT).show()
        }
        alert.setNeutralButton("Cancel"){dialog, which->
            Toast.makeText(this,"Cancel",Toast.LENGTH_SHORT).show()
        }

        alert.setCancelable(false)

        button.setOnClickListener(){
            alert.show()
        }
    }

    }


