fun main(args: Array<String>) {
////    println("Hello World!")
////
////    // Try adding program arguments via Run/Debug configuration.
////    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
////    println("Program arguments: ${args.joinToString()}")
//    val auto1 = Car("Tesla", "S Plaid", "Rojo", 4, " Familiar   ") //Asi se crea un objeto en Kotlin
//    //Las siguientes lineas quedan inutiles porque el constructor anterior ya asigna los valores
////    auto1.name = "Tesla"
////    auto1.model = "S Plaid"
////    auto1.color = "Rojo"
////    auto1.doors = 4
//    println("Auto 1:")
//    println("Nombre: ${auto1.name}")
//    println("Modelo: ${auto1.model}")
//    println("Color: ${auto1.color}")
//    println("Puertas: ${auto1.doors}")
//    println("Tipo vehiculo: ${auto1.tipoVehiculo}")
//    auto1.move()
//    auto1.parar()
//
//
//    val auto2 = Car("Ford", "Mustang", "Azul", 2, "    Deportivo   ")
//    //Las siguientes lineas quedan inutiles porque el constructor anterior ya asigna los valores
////    auto2.name = "Ford"
////    auto2.model = "Mustang GT"
////    auto2.color = "Silver"
////    auto2.doors = 2
//
//    println("\nAuto 2:")
//    println("Nombre: ${auto2.name}")
//    println("Modelo: ${auto2.model}")
//    println("Color: ${auto2.color}")
//    println("Puertas: ${auto2.doors}")
//    println("Tipo vehiculo: ${auto2.tipoVehiculo}")
//
//    auto2.move()
//    auto2.parar()
//
//    val auto3 = Automovil("Toyota", "Corolla", "Blanco", 4)
//    println("\n Automovil 3:")
//    println("Nombre: ${auto3.marca}")
//    println("Modelo: ${auto3.modelo}")
//    println("Color: ${auto3.color}")
//    println("Puertas: ${auto3.puertas}")
//    auto3.avanzar()
//    auto3.frenar()

    // Todas las lineas anteriores estan comentadas
    val unUsuario = Usuario("Pablo", "de la Iglesia", 34)
    unUsuario.nombre = "Latita"
    println(unUsuario.nombre)
    println("Apellido: ${unUsuario.apellido}")
    println("edad: ${unUsuario.edad}")

    print("\n")
    val unAmigo = Usuario("Alexis", "Smith", 34)
    println("Nombre: ${unAmigo.nombre}")
    println("Apellido: ${unAmigo.apellido}")
    println("edad: ${unAmigo.edad}")

    // Tambien se pueden asignar atributos en los constructores en caso de no ingresarlos todos.
    val otroUsuario = Usuario("Francisco", edad = 3)
    println("Nombre: ${otroUsuario.nombre}")
    println("Apellido: ${otroUsuario.apellido}")
    println("edad: ${otroUsuario.edad}")

    val otroUsuario2 = Usuario("Felipe", "de la Iglesia")
    println("Nombre: ${otroUsuario2.nombre}")
    println("Apellido: ${otroUsuario2.apellido}")
    println("Edad: ${otroUsuario2.edad}")

    val otroUsuario3 = Usuario(edad = 35, nombre = "Noelia", apellido = "Mallada")
    println("Nombre: ${otroUsuario3.nombre}")
    println("Apellido: ${otroUsuario3.apellido}")
    println("Edad: ${otroUsuario3.edad}")
    //Asignando el valor a un atributo con lateInit
    otroUsuario3.peliculaFavorita = "Donde estan las rubias"
    println("Pelicula favorita: ${otroUsuario3.peliculaFavorita}.")

//    val otroUsuario4 = Usuario()
//    println("Nombre: ${otroUsuario4.nombre}")
//    println("Apellido: ${otroUsuario4.apellido}")
//    println("edad: ${otroUsuario4.edad}")


    // Ultima linea de codigo del main
}

// Creando una clase con bloques de inicio
// Se puede asignar valores por defecto haciendo el atributo = "valor"
/*
    Para elegir entre valores por defecto o constructores secundarios es cuando necesitamos ejecutar
    cierto codigo con alguno de los atributos. Si es necesario ejecutar codigo utilizamos constructores secundarios
    pero si no necesitamos ejecutar codigo lo ejecutamos con valores por defecto en el constructor primario
 */
//class Usuario(var nombre: String, var apellido: String = "Apellido", var edad: Int = 0) {
//
//    // Palabra clave LateInit
//    /*
//    Cuando un objeto tiene un atributo deberiamos asignarlo al momento de crear el objeto ya que el constructor
//    necesita el valor como parametro, pero tal vez querramos asignarla despues. Kotlin no recomienda hacer esto
//    como una practica comun.
//    lateinit solo funciona con clases y no con variables de tipo primitivas. Cabe recordar que string es un tipo
//    especial de tipo primitivo y basicamente funciona como una clase.
//     */
//    // Declarando un atributo con lateinit
//    lateinit var peliculaFavorita: String
//
//
//    // Getter y setter por defecto pero con el codigo escrito
////    var nombre: String = nombre
////        get() {
////            return "Nombre: $field"
////        }
////        set(value) {
////            println("$value es el valor asignado al atributo nombre reemplazando a ${this.nombre}.")
////            field = value
////        }
//    /*
//        El valor de "field" es para no tener que hacer un getter o setter por atributo, entonces "field" se encarga
//        de referenciar al atributo que esta llamando al getter o al setter y evitar llamar constantemente al
//        getter y el setter que puede llegar a generar un bucle infinito. "field" solo puede usarse en getters y setters
//     */
//
//
//    // El valor se debe recibir como parametro, en este caso nombre
//
////    //Constructor secundario, tambien se puede ejecutar codigo en el constructor secundario
////    constructor(name: String,): this(name, "Apellido",0){
////        println("\nUtilizando el segundo constructor.")
////    }
////    constructor(name: String, lastName: String): this(name, lastName,0){
////        println("\nUtilizando el tercer constructor.")
////
////    }
//
//
//    // Creando un bloque de inicializacion
//    // Asi es un bloque de inicio
////    init {
////        if (nombre.lowercase().startsWith("a")){
////            this.nombre = nombre
////        }
////        else
////        {
////            this.nombre = "Usuario"
////            println("El nombre no comienza con A, se le asigno el valor Usuario")
////        }
////    }
//    // El orden de los bloques de iniciacion son importantes.
//
//    /*
//        Usamos getters y setters cada vez que necesitamos leer un atributo o asignar un valor a un atributo
//        Cada vez que buscamos el valor de un atributo estamos llamando al getter (accesor)
//        Cada vez que escribimos el valor de un atributo estamos llamando al setter (mutador)
//        Esto es importante por el encapsulamiento
//        En Kotlin son implicitos, pero si le queremos asignar codigo al getter o al setter podemos hacerlo de la siguiente
//        forma
//     */
//
//}


//Asi se crea una clase por defecto
//class Car{
//    var name: String = ""
//    var model: String = ""
//    var color: String = ""
//    var doors: Int = 0
//
//    fun move() {
//        println("El auto $name se esta moviendo.")
//    }
//    fun parar() {
//        println("El auto $name se detuvo.")
//    }
//}

////Creando una clase con constructor
//class Car(var name: String, var model: String, var color: String, var doors: Int, tipo: String){
//    /*
//    De la forma anterior declaramos una clase con los atributos en el constructor
//    Por lo que no hace falta declarar los atributos dentro de la clase
//     */
//    // En el caso que quisieramos trabajar antes en el valor de un atributo
//    var tipoVehiculo: String = tipo.trim()
//
////    var name: String = nombre
////    var model: String = modelo
////    var color: String = colorAuto
////    var doors: Int = puertas
//
//    fun move() {
//        println("El auto $name se esta moviendo.")
//    }
//    fun parar() {
//        println("El auto $name se detuvo.")
//    }
//}