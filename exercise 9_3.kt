fun main() {
    println("первый билет: 3 дня, 1000$")
    println("второй билет: 5 дней, 1500$")
    println("третий билет: 7 дней, 3000$")
    println("введите число дней")
    val days = readLine()!!.toInt()
    println("введите количество денег")
    val money = readLine()!!.toInt()
    when{
        (days>=7 && money >=3000) -> println("вы можете выбрать билет 3")
        (days>=5 && days<7 && money >=1500) -> println("вы можете выбрать билет 2")
        (days>=3 && days<5 && money >=1000) -> println("вы можете выбрать билет 1")
        else -> println("вы никуда не поедете")
    }


}