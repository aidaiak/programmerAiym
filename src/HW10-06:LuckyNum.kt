package src

fun main() {
    //val num = readLine()!!.toCharArray()

    // 1-ый вариант решения
    /*num.forEach {
        println("it = $it")
    }
    println("num[0] = ${num[0]}")
    println("num[1] = ${num[1]}")
    println("num[2] = ${num[2]}")
    println("num[3] = ${num[3]}")*/

    val num = readLine()!!.toInt()
    val x4 = num % 10
    val x3 = num / 10 % 10
    val x2 = num / 100 % 10
    val x1 = num / 1000 % 10
    println("num = $num, x4 = $x4, x3 = $x3, x2 = $x2, x1 = $x1")
}
