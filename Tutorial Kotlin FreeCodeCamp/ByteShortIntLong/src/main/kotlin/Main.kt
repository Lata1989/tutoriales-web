fun main() {
//fun main(args: Array<String>) {
    //println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
    /*
    Los Long al asignarlos se debe colocar una L al final del numero ej:
    var unLong: Long = 34135L
    Los Float al asignarlos se debe colocar una f al final del numero ej:
    var unFloat: Float = 13.6f
     */
    var unByte: Byte = Byte.MIN_VALUE
    println("El valor minimo para una variable de tipo Byte es : ${unByte}")
    unByte = Byte.MAX_VALUE
    println("El valor maximo para una variable de tipo Byte es: ${unByte}")

    var unShort: Short = Short.MIN_VALUE
    println("El valor minimo para una variable de tipo Short es : ${unShort}")
    unShort = Short.MAX_VALUE
    println("El valor maximo para una variable de tipo Short es: ${unShort}")

    var unInt: Int = Int.MIN_VALUE
    println("El valor minimo para una variable de tipo Int es : ${unInt}")
    unInt = Int.MAX_VALUE
    println("El valor maximo para una variable de tipo Int es: ${unInt}")

    var unLong: Long = Long.MIN_VALUE
    println("El valor minimo para una variable de tipo Long es : ${unLong}")
    unLong = Long.MAX_VALUE
    println("El valor maximo para una variable de tipo Long es: ${unLong}")

    var unFloat: Float = Float.MIN_VALUE
    println("El valor minimo para una variable de tipo Float es : ${unFloat}")
    unFloat = Float.MAX_VALUE
    println("El valor maximo para una variable de tipo Float es: ${unFloat}")

    var unDouble: Double = Double.MIN_VALUE
    println("El valor minimo para una variable de tipo Double es : ${unDouble}")
    unDouble = Double.MAX_VALUE
    println("El valor maximo para una variable de tipo Byte es: ${unDouble}")
}