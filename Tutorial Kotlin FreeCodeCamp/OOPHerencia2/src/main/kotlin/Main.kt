fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    val vista = View()
    val unBoton = Button("Submit", "Horizontal")
    var unBotonRedondo = RoundButton("Apretame", "Vertical", 60)

    println("Dibujando lo primero.")
    vista.dibujar()
    println("Dibujando lo segundo.")
    unBoton.dibujar()
    println("Dibujando lo tercero.")
    unBotonRedondo.dibujar()



    //Ultima linea de main()
}