package com.dodinoyo.intro_to_kotlin

class Cars(name: String, year: Int, weight: Int) : Vehicle(name, year, weight) {
    var isDriving = true

   fun drive() {
    if (isDriving){
        println("""
            $name is driving
        """)
    }
    }


    fun stop() {
        var isDriving = false
        tripsSinceMaintenance += 1

        if (tripsSinceMaintenance >= 100){
            needsMaintenance = true
            println("Your car needs a maintenance")
        } else {
           println( """
                $name
                Needs Maintenance ? : $needsMaintenance
                Trips : $tripsSinceMaintenance
            """)
        }
    }
}
