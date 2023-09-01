fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    var nombres: Array<String> = arrayOf("Pablo", "Noelia", "Panchito", "Felipe")
//    println(nombres)
//    for (index in 0..nombres.size-1) {
//        println(nombres[index])
//    }
    var edades: Array<Int> = arrayOf(34, 35, 3, 0)
////    println(edades)
//    for (index in 0..nombres.size-1) {
//        println(edades[index])
//    }
    println("El largo del array nombres es: ${nombres.size}")
    println("El largo del array edades es: ${edades.size}")

    for (index in 0..nombres.size-1) {
        println("${nombres[index]} tiene ${edades[index]} años.")
    }

    //Tambien es posible hacer arrays multitipo
    var mixeado = arrayOf(4, 5, 6, 8, 7, "Pablo", true, 'F',14)
    for (index in 0..mixeado.size-1) {
        println("El valor en el indice $index es: ${mixeado[index]}.")
    }
    for (index in 0..mixeado.size-1) {
        if (mixeado[index] is Int){ //Con "is" puedo comparar tipo
            println("El valor en el indice $index es un Int y su valor es: ${mixeado[index]}.")
        }
    }
    for (index in 0..mixeado.size-1) {
        if (mixeado[index] is String){ //Con "is" puedo comparar tipo
            println("El valor en el indice $index es un String y su valor es: ${mixeado[index]}.")
        }
    }



//Ultima linea del main
}