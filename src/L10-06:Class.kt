package src

import java.util.*
import kotlin.collections.ArrayList

/*fun main() {

    val x = 1
    val x2 = when {
        true -> "True"
        false -> "False"
    }
    println(x2)
}*/

fun main() {
    val arr = arrayOf(1, 2, 3, 4)
    // arr[7] = 5 -> выдаст ошибку, так как в нашем массиве нет элемента с индексом 7
    val x = arr[1] // -> 2
    //ArrayList
    //LinkedList
    val al = ArrayList<Int>(10_000) //изначально задаем большой размер
    al[10] = 10
    val ll = LinkedList<String>()
    ll[0] = "0"
    ll[1] = "1"
    //ll[0] = "2" - Заменит 0

    val list2 = listOf<Int>(1, 2, 3, 4)
    // list2.set(0, 20)
    // list2[0] = 20

    val mList = list2.toMutableList()
    mList.set(0, 10)
    mList[1] = 11
    mList.add(23)

    mList.forEach{ println("e = $it")}

    //val map = mapOf<String, String>("")

    arr.forEach { println(it) }

    for (i in 0..9) {
        println("e = $i")
    }

    while(false) {
        // do
    }
    do {
        //do
    } while (false)
}
