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

/*
* "FizzBuzz Assignment"
Rules :
- Write a program that prints the numbers from 1 to 100
- But for multiples of three print "Fizz" instead of the number
and for the multiples of five print "Buzz".
- For numbers which are multiples of both three and five print "FizzBuzz"

One hint :
There is a Kotlin operator called "rem" but often referred as "modulus" or "modulo",
and it gives you the remainder left over after division.
The rem operator is useful for finding out if X is a multiple of Y.
Knowing this should help you complete this assignment without any issue.

Extra Credit :
Instead of only printing "Fizz", "Buzz", and "FizzBuzz",
add a fourth print statement : "Prime".
You should print this whenever you encounter a number that is prime
(divisible only by itself and one).
As you implement this, don't worry about the efficiency of the algorithm you sue to check for primes.
It's okay for it to be slow.
*
*
*
*
*
*
* */