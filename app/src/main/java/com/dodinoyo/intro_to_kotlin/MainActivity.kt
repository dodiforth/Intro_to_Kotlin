package com.dodinoyo.intro_to_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var playerPosition: Int = 5 // this is global variable.
    val maxPositions: Int = 10
    val minPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Function intro
        //Functions in Class is called Method

        val isValidmove = move( 5 )


    }

    fun move(byAmount: Int) : Boolean{
        //var playerPosition: Int = 5 // this is called local variable,it only exist within the cope of particular function
        if(playerPosition + byAmount > maxPositions || playerPosition + byAmount < minPosition  ) {
            return false
        } else {
            playerPosition += byAmount
            return true
        }
    }
}

