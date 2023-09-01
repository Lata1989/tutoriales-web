fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    val unVehiculo = Car("Peugeot", "Plateado", 1, 5)
    unVehiculo.moverse()
    //Ultima linea del main()
}

/*
    Que son las clases abstractas, las clases abstractas son muy similares a las interfaces, la unica diferencia
    es que en las clases abstractas puedes tener un estado o sea tener atributos mientras que en las interfaces no.
    En las clases abstractas no se pueden crear instancias u objetos. Son solo creadas para que otras clases
    hereden de la clase abstracta. Las clases abstractas se utilizan cuando quieres que haga lo que se tiene que hacer
    pero no como se va a hacer, es decir definir funciones pero vacias.
    Interfaces:
    Abstract classes: Normalmente se utilizan cuando tienes una API y la API va a generar el codigo para las funciones.
    Otro ejemplo es una base de datos y puede otorgar las funciones para crear la BD, o el proceso CRUD sobre la DB
    pero no otorga el codigo para hacerlo. O sea el trabajo lo hace la API pero la estructura la otorga la clase abstracta

 */

/*
    Asi se crea una clase abstracta
 */

//abstract class Vehicle {
////    En una interfaz esto no se podria hacer
////    private var text: String = ""
//
//    // Las funciones en la clase abstracta no deben tener las {} porque no pueden implementar logica.
//    protected abstract fun moverse()
//
//    protected abstract fun detenerse()
//}
//
//class Automovil(
//    private var name: String, private var color: String, private var engines: Int,
//    private var doors: Int) : Vehicle() {
//
//    override fun moverse() {
//        TODO("Not yet implemented")
//    }
//
//    override fun detenerse() {
//        TODO("Not yet implemented")
//    }
//
//}