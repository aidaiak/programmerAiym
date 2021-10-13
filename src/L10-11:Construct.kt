package src


fun main() {
    val person = Person(
        name = "Ai",
        secondName = "Atklva",
        age = 24
    )

    val employee = Employee(
        nameEmp = "Ai",
        secondNameEmp = "Atklva",
        ageEmp = 24,
        company = "Apple"
    )

    /*val employee2: Employee = Person (
        nameEmp = "Ai",
        secondNameEmp = "Atklva",
        ageEmp = 24,
        company = "Apple"
    )


    val pJava = PersonJava("AiJava", "SS", 21)*/

    person.print()
    employee.print()

}

