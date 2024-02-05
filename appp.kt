import kotlin.math.pow

fun main() {
    println("введите первое число")
    var one = readLine()!!.toDouble()
    println("введите второе число")
    var two = readLine()!!.toDouble()
    when{
        (one > two) -> one += 1
        (two > one) -> two += 1
        (one == two) -> one.pow(3)
    }
    println("первое число - $one второе число - $two")
}