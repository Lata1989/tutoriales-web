//Creando una clase con constructor
// Clase auto
class Car(var name: String, var model: String, var color: String, var doors: Int, tipo: String){
    /*
    De la forma anterior declaramos una clase con los atributos en el constructor
    Por lo que no hace falta declarar los atributos dentro de la clase
     */
    // En el caso que quisieramos trabajar antes en el valor de un atributo
    var tipoVehiculo: String = tipo.trim()

//    var name: String = nombre
//    var model: String = modelo
//    var color: String = colorAuto
//    var doors: Int = puertas

    fun move() {
        println("El auto $name se esta moviendo.")
    }
    fun parar() {
        println("El auto $name se detuvo.")
    }
}

// Clase usuario
class Usuario(var nombre: String, var apellido: String = "Apellido", var edad: Int = 0) {

    // Palabra clave LateInit
    /*
    Cuando un objeto tiene un atributo deberiamos asignarlo al momento de crear el objeto ya que el constructor
    necesita el valor como parametro, pero tal vez querramos asignarla despues. Kotlin no recomienda hacer esto
    como una practica comun.
    lateinit solo funciona con clases y no con variables de tipo primitivas. Cabe recordar que string es un tipo
    especial de tipo primitivo y basicamente funciona como una clase.
     */
    // Declarando un atributo con lateinit
    lateinit var peliculaFavorita: String


    // Getter y setter por defecto pero con el codigo escrito
//    var nombre: String = nombre
//        get() {
//            return "Nombre: $field"
//        }
//        set(value) {
//            println("$value es el valor asignado al atributo nombre reemplazando a ${this.nombre}.")
//            field = value
//        }
    /*
        El valor de "field" es para no tener que hacer un getter o setter por atributo, entonces "field" se encarga
        de referenciar al atributo que esta llamando al getter o al setter y evitar llamar constantemente al
        getter y el setter que puede llegar a generar un bucle infinito. "field" solo puede usarse en getters y setters
     */


    // El valor se debe recibir como parametro, en este caso nombre

//    //Constructor secundario, tambien se puede ejecutar codigo en el constructor secundario
//    constructor(name: String,): this(name, "Apellido",0){
//        println("\nUtilizando el segundo constructor.")
//    }
//    constructor(name: String, lastName: String): this(name, lastName,0){
//        println("\nUtilizando el tercer constructor.")
//
//    }


    // Creando un bloque de inicializacion
    // Asi es un bloque de inicio
//    init {
//        if (nombre.lowercase().startsWith("a")){
//            this.nombre = nombre
//        }
//        else
//        {
//            this.nombre = "Usuario"
//            println("El nombre no comienza con A, se le asigno el valor Usuario")
//        }
//    }
    // El orden de los bloques de iniciacion son importantes.

    /*
        Usamos getters y setters cada vez que necesitamos leer un atributo o asignar un valor a un atributo
        Cada vez que buscamos el valor de un atributo estamos llamando al getter (accesor)
        Cada vez que escribimos el valor de un atributo estamos llamando al setter (mutador)
        Esto es importante por el encapsulamiento
        En Kotlin son implicitos, pero si le queremos asignar codigo al getter o al setter podemos hacerlo de la siguiente
        forma
     */

}