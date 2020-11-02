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
    }
}

