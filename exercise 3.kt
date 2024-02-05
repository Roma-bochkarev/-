fun main() {
    println("введите число")
    val age = readLine()!!.toInt()
    when(age){
        in 0..2 -> println("младенец")
        in 3..6 -> println("детсадовец")
        in 7..14 -> println("школьник")
        in 15..18 -> println("студент")
        in 19..25 -> println("взрослый")
        in 26..45 -> println("очень взрослый")
        else -> println("старый")
    }

}