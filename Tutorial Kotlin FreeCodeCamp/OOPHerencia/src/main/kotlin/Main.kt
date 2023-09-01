fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    val unAuto = Car("BMW", "Rojo", 1, 4)
    val unAvion = Plane("Boeing","White", 4, 4)

    unAuto.moverse()
    unAuto.detenerse()
    unAvion.moverse()
    unAvion.detenerse()
//    unAvion.volar()


    // Ultima linea del main()
}