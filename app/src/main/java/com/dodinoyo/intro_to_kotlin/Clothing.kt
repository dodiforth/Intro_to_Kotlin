package com.dodinoyo.intro_to_kotlin

open class Clothing(var name: String, var size: Int) {


    var isClelean:Boolean = false

    constructor(name: String, size: Int, isClean:Boolean): this(name, size){
        this.isClelean = isClelean
    }

    open fun washClothing() {
        this.isClelean = true
    }


}