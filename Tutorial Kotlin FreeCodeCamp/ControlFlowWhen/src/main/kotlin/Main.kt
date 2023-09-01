fun main(args: Array<String>) {
//    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
    var alarma = 11
    when (alarma) {
        1, 2, 3, 4, 5, 6 -> println("El numero esta en el rango de 1 a 6.")
        in 7..14 -> println("El numero esta en el rango de 7 a 14.")
        in 20..15 -> println("The time es $alarma")
        in 21..24 -> println("The time es $alarma")
        else -> println("The time es $alarma")
    }

    var horario: Int = 27
    var unTexto: String = when (horario) {
        in 1..8 -> "Es de madrugada."
        in 9..11 -> "Es horario matutino"
        12, 13 -> "Es hora de almorzar"
        in 14..17 -> "Es hora de la siesta"
        18 -> "Es hora de la merienda"
        in 19..21 -> "Es hora de volver a casa"
        22 -> "Es hora de cenar"
        23, 24 -> "Es hora de irse a dormir."
        else -> "El horario ingresado esta fuera de rango."
    }
    println(unTexto)
}