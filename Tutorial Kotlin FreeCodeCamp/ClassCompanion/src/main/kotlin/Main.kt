fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    /*
    Companion Object
     */
//    val calculardora = Calculadora ()
//    var resultado: Int = calculardora.sumar(9, 8)
//    var resultado: Int = Calculadora.sumar(9,7)
//    println("La suma es: $resultado.")
//    var maximo: Int = Calculadora.max
//    println("El valor de maximo en la clase Calculadora es: $maximo.")
//    maximo = Int.MAX_VALUE // Manteniendo Ctrl sobre el tipo de dato en Int.MAX_VALUE podemos acceder a la info del tipo de dato


    /*
    Singleton
    El Singleton es un patron de diseño en Kotlin con el que solo deseas tener solamente un objeto de una clase
    y tambien deseas una instancia de esa clase disponible globalmente a traves del programa y hay varias razones
    pero la mas comun son las base de datos y una base de datos no es algo que querramos tener cargada muchas veces.
    La forma de acceder a los metodos y atributos de los singleton es a traves de los companion objects
     */

//    val instance: Database? = Database.getInstance()
//    println(instance)
//    val instance2: Database? = Database.getInstance()
//    println(instance2)
//    println(Database)
//    println(Database)


    /*
        LazyInitialization: Se utiliza cuando crear un objeto o instancia va a ser costoso computacionalmente y en ese
        caso es recomendable la LazyInitialization
     */
    val usuario1 = Usuario("Pablo", "de la Iglesia", 34)
    val usuario2 = Usuario("Tito", "Bonoris", 30)
    // Creando un objeto con LazyInitialization
    val usuario3 by lazy {
        Usuario("Noelia", "Mallada", 35)
    }

    // El objeto usuario3 creado con lazyInitialization va a ser creado recien en el momento que sea llamado el objeto
    println("El nombre del usuario 3 es: ${usuario3.nombre}.")


    //Ultima linea del main()
}


//Para hacerlo asi no tenemos que tener la clase, es la forma mas simple y concisa de crear un singleton
//object Database {
//    init {
//        println("Database created")
//    }
//}