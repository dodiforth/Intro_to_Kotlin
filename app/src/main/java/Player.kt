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



    //1st Version
//    fun dropLoot(name: String): Boolean {
//        for (item in inventory) {
//            if (item.name == name) {
//                inventory.remove(item);
//                return true
//            }
//        }
//        return false
//    }
//        println("$name will be dropped")
//        return inventory.removeIf { it.name == name}

        //->This code doesn't just drop one item per say. So we need a for loop that can only drop one item at once

        //So this checks each item in the list and removes it if the name is the same as the name we passed into dropLoot.
        //Now it here(where the it.name) refers to the item that's currently being checked.
        //so if the name of the current item matches Invisibility Potion in our example,
        //then the item gets removed from the list.
        //Now, if any items are removed, it returns true, otherwise it returns false.

    //So this is function overloading, you create another version of the function with different parameters
    //and Kotlin calls the one that matches the argument types.

    //2nd Version
    fun dropLoot(name: String): Boolean{
        var result = false
        for (item in inventory){
            if (item.name == name){
                inventory.remove(item)
                result = true
                break
            }
        }
        return result
    }


    fun showInventory() {
        var total = 0.0
        println("$name's Inventory")
        for (item in inventory){
            println(item)
            total += item.value
        }
        println("==================================")
        println("Total score is : $total")
        println("==================================")
    }
}


