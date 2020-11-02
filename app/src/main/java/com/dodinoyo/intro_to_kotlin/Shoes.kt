package com.dodinoyo.intro_to_kotlin

class ShoesWithLaces(name: String, size: Int): Clothing(name, size) {

    var lacesName: String? = null
    var areLacesClean: Boolean = false
    var areShoesLaced: Boolean = false

    fun lacedShoes(name: String){
        this.lacesName = name
        this.areLacesClean = true
        areShoesLaced = true
    }

    override fun washClothing(){
        super.washClothing()
        areLacesClean = true
    }
}