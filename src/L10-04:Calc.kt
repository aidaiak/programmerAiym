package src

import java.lang.NumberFormatException

fun main() {
    /* val x = readLine()
     println(x)*/

    println("Number input: ")
    val a1 = readLine().parseToInt() //?: 0 если null, то использует по дефолту 0
    println("Number input: ")
    val a2 = readLine().parseToInt()

    val sum = a1 + a2
    println("Sum: $sum")

    /*if (true) {
        //
    } else if(true){
        //
    } else (){
        //
    }*/

    /*val x = "v"
    when(x) {
        "z" -> println()
        "v" -> println()
        else {

        }
    }*/
}

private fun String?.parseToInt(): Int {
    //extension - функция расширения, позволяет написать функцию так, что мы меняем класс изнутри
    if (this == null) return 0
    if (this == "") return 0

    return try {
        this.toInt()
    } catch (e: NumberFormatException) {
        println("exception = $e")
        return 0
    }
    return 0
}