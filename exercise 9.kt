import kotlin.math.pow
fun main() {
    println("введите число")
    val num = readLine()!!.toDouble()
    var result = 1.0
    when{
        (num > 3.6) -> result = 45 * num.pow(2) + 5
        (num <= 3) -> result = (5 * num)/(10 * num.pow(2) + 1)
        else -> println("не входит в диапазон")
    }
    println(result)

}