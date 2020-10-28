package com.dodinoyo.intro_to_kotlin.Texts

var genreln: String = "Lofi"
var artistln: String = "Codoing Master"
var yearln: Int = 2020

//It is a function to print the variables.
fun genre(nameOfGenre: String): String{
    println("Genre: ${genreln}")
    return genreln
}

fun artist(nameOfArtist: String): String{
    println("Artist: ${artistln}")
    return artistln
}

fun year(releaseYear: Int): Int{
    println("Artist: ${yearln}")
    return yearln
}