open class Enemy(val name: String, var hitPoints: Int, var lives: Int) {

    open fun takeDamage(damage: Int){
        val remainHitPoints = hitPoints - damage
        if(remainHitPoints > 0){
            hitPoints = remainHitPoints
            println("$name took $damage points of damage, and has $hitPoints left")
        } else {
            lives -= 1
            if(lives > 0){
                println("$name lost a life")
            } else {
                println("No lives left $name is dead")
            }
        }
    }

    override fun toString(): String {
        return "Name: $name, Hitpoints: $hitPoints, Lives: $lives"
    }

}

// lives = lives + 8        lives += 8
// lives = lives - damage   lives -= damage
// lives = lives * 10       lives *= 10
// lives = lives / 3        lives /= 3
// lives = lives % 2        lives%=2