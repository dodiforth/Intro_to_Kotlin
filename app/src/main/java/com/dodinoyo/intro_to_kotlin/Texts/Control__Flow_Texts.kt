package com.dodinoyo.intro_to_kotlin.Texts

/*

-Control Flow
-What control flow is
-If statements and expressions
//if (condition to test) { execute code if true }
        var isDoorOpen : Boolean = false
        var isDoorLocked : Boolean = true
        var doesHaveKey : Boolean = true
        var action: String = ""

        if (isDoorLocked == true && doesHaveKey == false) {
            action = "Leave"
        } else if (isDoorOpen == true) {
            action = "Enter"
        } else{
            action = "Open door"
        }

        action = if (isDoorOpen == true) "Enter" else "Leave"


-When statements and expressions
when (isDoorOpen) {
            true -> action = "Enter"
            false -> action = "Leave"
            else -> {}

-While loops
// while loops
        // while (condition to test) {code to execute of condition returns true}
        var current: Int = 1
        val max: Int = 100
        var total: Int = 0
        while (current <= 100) {
            total += current
            current ++

        }

-For each loops
// For in loops

        val roster = listOf<String>("Nimish", "Suzi", "Jack", "Jill")
        var namesStrting: String = ""

        for (name in roster) {
            namesStrting += name + ", "
        }
"FizzBuzz Assignment"
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


 */

