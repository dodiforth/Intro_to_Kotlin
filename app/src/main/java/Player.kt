class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist", 1)
    private val inventory = ArrayList<Loot>()

    fun show(){
       if (lives > 0){
           println("$name is alive")
       } else {
           println("$name is dead")
       }
    }

    override fun toString(): String {
        return """
            name: $name
            lives: $lives
            level: $level
            score: $score
            ${weapon}
            """
    }

    fun getLoot (item: Loot){
        inventory.add(item)
        //code to saved the inventory goes here
    }


    fun dropLoot (item: Loot): Boolean {
        return if (inventory.contains(item)){
            inventory.remove(item)
            true
        } else{
            false
        }
    }

    fun dropLoot(name: String): Boolean{
        println("$name will be dropped")
        return inventory.removeIf { it.name == name}
        //So this checks each item in the list and removes it if the name is the same as the name we passed into dropLoot.
        //Now it here(where the it.name) refers to the item that's currently being checked.
        //so if the name of the current item matches Invisibility Potion in our example,
        //then the item gets removed from the list.
        //Now, if any items are removed, it returns true, otherwise it returns false.
    }
    //So this is function overloading, you create another version of the function with different parameters
    //and Kotlin calls the one that matches the argument types.

    fun showInventory() {
        println("$name's Inventory")
        for (item in inventory){
            println(item)
        }
        println("==================================")
    }
}