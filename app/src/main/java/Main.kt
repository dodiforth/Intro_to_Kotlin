fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    val tim = "Tim Buchalka"
    println(tim)

    val timsWeeklySalary = 32
    val timsMonthlySalary = timsWeeklySalary * 4
    println("Tim's weekly salary is $timsWeeklySalary")
    println("Monthly, that comes to $timsMonthlySalary")

    println()

    val apples = 6
    val oranges = 5
    val fruit: Int = apples- oranges
    println("$apples apples - $oranges oranges leaves $fruit piece(s) of fruit")
    println("A quarter of the apple is ${apples/4}")
    println()

    //String concatenation and interpolation

    println()
    val weeks = 234
    val years: Double = weeks/52.0
    println("$weeks weeks is $years years")

    println("My nams is $tim")

    println("Cardi B gifted loads of \$\$\$\$ CASH \$\$\$\$ to his boyfriend and apparently it offended her fans")
}