package com.dodinoyo.intro_to_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val t_shirt = Clothing("t-shirt",6)
        val isClean = t_shirt.isClelean
        t_shirt.washClothing()


        val sneakers: ShoesWithLaces = ShoesWithLaces("sneakers", 10)
        sneakers.lacedShoes("checkered laces")
        sneakers.washClothing()

        println("Hello Sunflower")

        val ferrari = Cars("Ferrari",1987,3)
        val volvo = Cars("Volvo",2012,10)
        val hyundai = Cars("Sonata",2020,5)

        ferrari.make()
        volvo.make()
        hyundai.make()

        ferrari.drive()
        ferrari.stop()
        ferrari.drive()
        ferrari.stop()
        ferrari.drive()
        ferrari.stop()
        ferrari.drive()
        ferrari.stop()
        ferrari.drive()
        ferrari.stop()

        volvo.drive()
        volvo.stop()
        volvo.drive()
        volvo.stop()
        volvo.drive()
        volvo.stop()

        hyundai.drive()
        hyundai.stop()


    }
}

/*
*
Homework Assignment #6: Classes and Objects

Details:
 
Create a class called "Vehicle" and add methods that allow you to set the "Make", "Model", "Year,", and "Weight".

The class should also contain a "NeedsMaintenance" boolean that defaults to False, and and "TripsSinceMaintenance" Integer that defaults to 0.

Next create a subclass that inherits the properties of Vehicle class. Call this new subclass "Cars".
The Cars class should contain a method called "Drive" that sets the state of a boolean isDriving to True.  It should have another method called "Stop" that sets the value of isDriving to false.

Switching isDriving from true to false should increment the "TripsSinceMaintenance" counter. And when TripsSinceMaintenance exceeds 100, then the NeedsMaintenance boolean should be set to true.

Add a "Repair" method to either class that resets the TripsSinceMaintenance to zero, and NeedsMaintenance to false.

Create 3 different cars, using your Cars class,
* and drive them all a different number of times.
* Then print out their values for Make, Model, Year, Weight, NeedsMaintenance, and TripsSinceMaintenance

Turning it In: 
Zip up your code files and attach them here to receive a grade and continue with the course.
*
*
*
*
*
*
* */