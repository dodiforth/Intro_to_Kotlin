fun main(args: Array<String>) {
    val tim = Player("Tim")
    tim.show()

    val louise = Player("Louise", 5)
    louise.show()

    val gr8 = Player("gr8", 4, 8)
    val one2watch = Player("Ace", 2, 5, 1000)
    gr8.show()
    one2watch.show()
    println(one2watch.weapon.name.toUpperCase())
    println(one2watch.weapon.damageInflicted)

    var axe = Weapon("Axe",12)
    gr8.weapon = axe
    println(gr8.weapon.name)
    println(axe.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(gr8.weapon.damageInflicted)

    tim.weapon = Weapon("Sword", 10)
    println(tim.weapon.name)

    tim.weapon = Weapon("Spear",14)
    println(tim.weapon.name)
//    val lives = 0
//
//    var isGameOver = (lives < 1)
//    println(isGameOver)
//
//    if(isGameOver){
//        println("Game Over!")
//    } else {
//        println("You're still alive")
//    }

//    println("How old are you ? : ")
//    val age = readLine()!!.toInt()
//    println("age is $age")
//
//    val message: String
//    message = when {
//        age <18 -> {
//            "You're too young to vote"
//        }
//        age == 100 -> {
//            "Congratulations"
//        }
//        else -> {
//            "You can vote"
//        }
//    }

//    val message: String
//    message = if (age <18 ){
//        "You're too young to vote"
//    } else if (age == 100) {
//        "Congratulations"
//    } else {
//        "You can vote"
//    }
}