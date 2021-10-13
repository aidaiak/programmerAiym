package src

class Human(val name: String, val sName: String) {

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (this === other) return true
        if (other !is Human) return false

        if (this.name != other.name) return false

        return true
    }
}

data class DataHuman(val name: String)