fun main() {
//fun main(args: Array<String>) {
    //println("Hello World!")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
    //println("Hola mundo!")

    // Tipos de datos:
    /*
    Cadenas de caracteres:
    Char: Un caracter
    String: Cadenas de caracteres
    Numericos:
    Byte:Numerico entero entre -128 y 127
    Short: Numerico entero
    Int: Numeros enteros
    Long: El entero mas grande de todos los aceptados por Kotlin
    Double: Numero decimal
    Float: Decimal que utiliza una f al final del numero y tiene menos precision que el double
    Boolean: Logicas.
    Arrays: Son los arreglos
     */

    // var se usa para variables y val para constantes
    // La forma de declarar variables en Kotlin segun el estilo correcto es:
    // var nombreVariable: Tipo = Valor
    // Se recomienda un maximo de 100 caracteres por linea

    var userName: String = "Latita"
    var age: Int = 34
    println("Hola ${userName}!!! Tienes ${age} años.")
}