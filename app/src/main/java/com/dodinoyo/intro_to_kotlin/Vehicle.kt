package com.dodinoyo.intro_to_kotlin

open class Vehicle(val name: String, var year: Int, var weight: Int) {
    //add methods to set "Make", "Model", "Year", "Weight"

    var needsMaintenance: Boolean = false
    var tripsSinceMaintenance: Int = 0

    open fun make() {
      return  println("""
            Model : $name
            Year : $year
            Weight : $weight
        """)

    }

    open fun repair() {
        needsMaintenance = false
        tripsSinceMaintenance = 0
    }
}