//This Loot class will hold for the inventory items that will be storing in the list.
//Loot : Anything that player picks up in the course of the game will be known as loot.
//enum is a way of storing multiple choices or something.

enum class LooType {
    POTION, RING, ARMOR
}
class Loot(val name: String, val type: LooType, val value: Double) {

    override fun toString(): String {
        return "$name is $type and is worth $value"
    }
}