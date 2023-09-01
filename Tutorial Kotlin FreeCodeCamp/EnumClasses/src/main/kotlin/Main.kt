fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
    /*
        Enum classes es usadoi cuando quieres representar un set fijo de valores, los Enums son como las
        constantes pero mucho mas poderosas, normalmente son utilizadas en condicionales if o when
     */

    //Accediendo a los valores del enum
//    println(Direcciones.NORTH)
//    println(Direcciones.EAST)
//    println(Direcciones.WEST)
//    println(Direcciones.SOUTH)
    for (dir in Direcciones.values()) {
        println("La direccion ${dir} tiene como direccion: ${dir.direccion} y la distancia es: ${dir.distancia}.")
    }

    println(Direcciones.NORTH.direccion)
    println(Direcciones.SOUTH.direccion)
    println(Direcciones.EAST.direccion)
    println(Direcciones.WEST.direccion)
    println(Direcciones.NORTH.name)
    println(Direcciones.SOUTH.name)
    println(Direcciones.EAST.name)
    println(Direcciones.WEST.name)
    println(Direcciones.NORTH.distancia)
    println(Direcciones.SOUTH.distancia)
    println(Direcciones.EAST.distancia)
    println(Direcciones.WEST.distancia)
    println("\n")
    Direcciones.WEST.printData()
    Direcciones.EAST.printData()
    Direcciones.NORTH.printData()
    Direcciones.SOUTH.printData()

    val unaDireccion = Direcciones.valueOf("SOUTH")

    when(unaDireccion) {
        Direcciones.EAST -> println("La direccion es Este")
        Direcciones.WEST -> println("La direccion es Oeste")
        Direcciones.SOUTH -> println("La direccion es Sur")
        Direcciones.NORTH -> println("La direccion es Norte")
    }

}

//Podemos definir un enum class sin constructor pero tambien podemos hacerlo con constructor
//enum class Direcciones {
enum class Direcciones(var direccion: String, var distancia: Int)  {
//    NORTH,
//    SOUTH,
//    EAST,
//    WEST
    NORTH("North", 10),
    SOUTH("South", 20),
    EAST("East", 30),
    WEST ("West", 40);

    //Cada una de las cosas nombradas dentro del enum class es un objeto(instancia) de la enum class
    fun printData() {
        println("Direccion = ${direccion} y Distancia = ${distancia}.")
    }
}