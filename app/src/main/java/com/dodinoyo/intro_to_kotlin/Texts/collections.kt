package com.dodinoyo.intro_to_kotlin.Texts

/*
What is mutable even mean ?
It is a word for if something is liable to change, we call it's mutable.
In Kotlin, we learned the idea of mutable as learning 'val' and 'var'.
val means immutable.
var means mutable.

(The truth is more nuanced than that: val does not mean immutable, val means read-only. That means that you're not
allowed to explicitly write to a val, but it doesn't guarantee that they're immutable.)

The difference between List and Array
Let's start it by taking an example. Suppose we want to store the data of programming languages.
To do so, we can either create different variables for different languages or
we can make a list or an array of of languages and add a language into it.

val lang = arrayOf<String>("Kotlin", "Java", "C++")
or
val lang = listOf<String>("Kotlin", "Java", "C++")

So, following are the differences between List and Array :

1. If you're using Array<T>, then the data will be stored in a sequential manner in the storage
i.e. a continuous block of storage will be allocated to store the data.

But if we talk about List<T>, then it an interface which may have different implementations
such as ArrayList<T>, LinkedList<T>, etc and memory representation of these List<T> depends on the implementation
i.e. whether it is an ArrayList<T> or LinkedList<T> or something else.

2. Suppose in future, if we want to change the name of the "Kotlin" to "Swift".
Then if we are using an Array of lang then we can simply update the array by assigning the new value
because Arrays are mutable in nature.

But Lists are immutable in nature. So, you can't update the List<T> values.
In order to update the values, you need to use MutableList<T>

val lang = arrayOf<String>("Kotlin", "Java", "C++")
lang[0] = "Swift"  // no error

val lang = listOf<String>("Kotlin", "Java", "C++")
lang[0] = "Swift" // error


------------below is note taking by lectures from Pirple.com------------
// non- mutable list :

We cannot take a specific index to set something else, that's not allowed,
And we can't add or move elements from the list as well.

var weekdays = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
weekdays.get(0)
weekdays.get(1)
weekdays.get(2)
weekdays[3]
weekdays[4]

// but we can change entire list
weekdays = listOf("")



//arrays
val trueOrFalseAnswerKey = arrayOf(false, true, true, false, false)
trueOrFalseAnswerKey.set(2, false)
trueOrFalseAnswerKey[2] = false
but still we cannot put or remove values from the array

//---------------------------------------------------------

// mutable lists, arrays
var roster = mutableListOf<String>("Himish", "Sarah", "John")
roster.add("Tracy")
val himish: String = roster.removeAt(0)

var shoppingLisit = arrayListOf<String>("Eggs", "Butter", "Shoes")
shoppingLisit.add(0, "Bread")
*/