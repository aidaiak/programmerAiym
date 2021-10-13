package src

fun main() {
    val x = readLine()!!
    do {
        println("Введите число: ")
        val f = readLine()!!.toInt()
        println(factorial(f))
        println("Продолжить? y-yes, any-no")
        val x = readLine()!!
    }  while (x == "y")
}

fun factorial (n: Int): Double = if (n < 2) 1.0 else n * factorial(n)