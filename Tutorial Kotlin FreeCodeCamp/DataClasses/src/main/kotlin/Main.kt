fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    /*
    Diferencia entre:
        Structure Equality: Es cuando el contenido de las variables es comparado y su tipo y contenido es identico
        Referencial Equality: Evalua si la referencia es la misma pero en objetos.
     */

//    var nombre1: String = "Latita"
//    var nombre2: String = "Pablo"
//
//    // Structure equality
//    println(nombre1 == nombre2)
//    // Referencial equality
//    println((nombre1 === nombre2))


    var usuario1 = User("Latita", "de la Iglesia", 34)
    var usuario2 = User("Latita", "de la Iglesia", 34)

    // En el siguiente caso vemos dos objetos distintos que tienen los mismos valores en sus atributos.
    /*
        Podemos ver que los atributos tienen los mismos valores pero esta comparacion va a ser falsa.
        Todas las clases que creamos en Kotlin utilizan implicitamente y heredan de la clase Any y porque cada
        clase creada hereda de la clase Any todas las clases van a utilizar los metodos dentro de la clase Any
        si no sobreescribimos (override) esos metodos en la clase que creamos va a usar el metodo heredado
     */
    println(usuario1 == usuario2)
    // Ejemplo
    println(usuario1.equals(usuario2))
    println(usuario1.hashCode())
    println(usuario1.toString())
    println(usuario2.toString())


    // Ultima linea del main()
}

/*
    Para entender que es una data Class hay que poder diferencias entre dos cosas:
    Structure Equality:
    Referencial Equality:
 */