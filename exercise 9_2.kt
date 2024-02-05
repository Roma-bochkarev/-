import kotlin.math.pow

fun main() {
    println("введите число")
    val num = readLine()!!.toInt()
    when{
        (num/100 == num%10) -> println("равны")
        else -> println("не равны")
    }


}