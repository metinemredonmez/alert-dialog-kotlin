package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // içinde bulundugumuz durum app ın ıcındekı guncel durum
        // context
        //her objesının bırbırıl ıle haberlesmesı ne oldugunu bılmesı ıcın tek context yoktur
        // activity context , dıger app context
        //




        // toast  ! sample

        // context de MainActivity.this kotlinde yazamıyoru javada yazıyoruz  -> bu sekılde our  this@MainActivity seklınde yazarız

        Toast.makeText(this@MainActivity,"welcome",Toast.LENGTH_LONG).show()


    }

    fun save(view : View) {
        // Alert  message
        val alert = AlertDialog.Builder(this)
        alert.setTitle("save")
        alert.setMessage("are you sure?")
        alert.setPositiveButton("yes") {dialog, which ->

            //onclick listener
            Toast.makeText(applicationContext,"saved",Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("no") {dialog,  which ->

            //on click listener
            Toast.makeText(applicationContext,"not saved",Toast.LENGTH_LONG).show()
        }
        alert.show()

    }
}