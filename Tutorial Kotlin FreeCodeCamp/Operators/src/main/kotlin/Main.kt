fun main() {
//fun main(args: Array<String>) {
//    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
    var unaVariable: Int = 360
    var otraVariable: Int = 19
    var peronistan: Int = unaVariable + otraVariable
    println("El resultado de ${unaVariable} + ${otraVariable} = ${peronistan}")
    peronistan = unaVariable - otraVariable
    println("El resultado de ${unaVariable} - ${otraVariable} = ${peronistan}")
    peronistan = unaVariable * otraVariable
    println("El resultado de ${unaVariable} x ${otraVariable} = ${peronistan}")
    var resultDouble: Double = (unaVariable.toDouble() / otraVariable.toDouble())
    println("El resultado de ${unaVariable} / ${otraVariable} = ${resultDouble}")

    var isActive: Int = 150

    /*
    Comparadores aritmeticos

    <: Menor que
    <=: Menor o igual que
    >: Mayor que
    >=: Mayor o igual que
    ==: Es igual que
    !=: Es distinto de

     */

    if (isActive > 150) {
        println(isActive)
    } else if (isActive < 150) {
        println(isActive)
    } else {
        println("Viva Peron!")
    }

    /*
    Operadores logicos:
    &&: Es el operador logico AND
    ||: Es el operador logico OR
    !: Es el operador logico NOT

     */

    var unBooleano: Boolean = true
    var otroBooleano: Boolean = false

    if (unBooleano && otroBooleano) {
        println("El AND es true")
    } else {
        println("El AND es false")
    }

    if (unBooleano || otroBooleano) {
        println("El OR es true")
    } else {
        println("El OR es false")
    }

    if (unBooleano) {
        println("El valor de unBooleano es: $unBooleano y el valor negado es ${!unBooleano}.")
    }
    if (!otroBooleano) {
        println("El valor de unBooleano es: $otroBooleano y el valor negado es ${!otroBooleano}.")
    }

    var aTexto: Boolean = false
    var unTexto: String = if (aTexto) {
        "Viva Peron"
    } else {
        "Viva Cristina"
    }
    println(unTexto)
}