fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
    var unText: String? = null

//    if (unText != null) {
//        println(unText.length)
//    }
//    else {
//        println("La variable es null")
//    }
    println(unText?.length)
    /*
    Con el operador !! basicamente verifica si el valor es nulo, si no es nulo ejecuta la excepcion.
     */
//    unText = null
    unText = "Algo"
    println(unText!!.length)
    unText = null
    var text2 = unText ?: "Chupala peronista"
    println(text2)

    // Lo mismo de antes pero en largo
    var text3: String?

    if (unText != null) {
        text3 = unText
    }
    else {
        text3 = "Esta variable es null";
    }
    println(text3)
}