package com.dodinoyo.intro_to_kotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        for (i in 1..100){
              if ( i % 3 == 0 && i % 5 == 0){
                Log.d("FizzBuzz", "FizzBuzz")
            } else if ( i % 3 == 0){
                Log.d("Fizz", "Fizz")
            } else if (i % 5 == 0) {
                Log.d("Buzz", "Buzz")
            } else{
                Log.d("StringNumber", i.toString())
            }
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