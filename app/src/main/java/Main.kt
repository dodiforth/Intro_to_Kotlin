fun main(args: Array<String>) {

    val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampire("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)

    val dracula = VampireKing("Count Dracula")
    println(dracula)
    dracula.takeDamage(12)

    //This is a comment to test Git update btw my iMac and Dell laptop
}