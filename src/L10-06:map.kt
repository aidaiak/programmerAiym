package src

fun main () {
    val m = mapOf(
        Pair(0, "1"),
        Pair(1, "2"),
        2 to "3",
        3 to "4",
        Pair(3.0, "asd"),
        Pair("key", "value"),
        Pair("key2", "9"),
        null to "444x"
        // если сделать одинаковый key, то программа перезапишет значение

    )

    val temp = hashMapOf<String, String>()
    temp[name] = number
    number = temp[name]
    println(m.get("key"))
    println("null to ${m[null]}")

    m.forEach { (key, value) ->
        println("key = $key, value = $value")
    }

    println(m.keys)
}
