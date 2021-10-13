package src

fun main() {
    val h1 = Human("Natasha", "Orlova")
    val h2 = Human("Natasha", "Orlova")

    println(h1 == h2)
    println(h1.equals(h2))
    println(h1)
    println(h2.hashCode())

    val dh1 = DataHuman("Olya")
    val dh2 = DataHuman("Olya")
    println(dh1 == dh2)

}