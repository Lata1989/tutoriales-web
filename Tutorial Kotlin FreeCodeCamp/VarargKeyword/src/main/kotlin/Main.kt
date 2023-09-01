fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}
    println("El valor de la suma es ${suma(3,4,5,6,9,8,6,2,5,4,3,6,8,7,4,1)}")
    println("El valor de la suma es ${otraSuma(6,7,8,9)}")
    unaSuma(4,5,8,9,7,5,6,1,3,2,0,4,5,8,7,9,1,2,3)
}

fun suma(vararg numeros : Int) : Int {
    var total : Int = 0
    for (numero in numeros) {
        total += numero
    }
    return total
}

// La funcion anterior en una sola linea de codigo
fun otraSuma(a: Int, b: Int,c: Int, d:Int) : Int = (a + b + c + d)

// Usando forEach

fun unaSuma(vararg numeros: Int) {
    numeros.forEach { println(it) }
}