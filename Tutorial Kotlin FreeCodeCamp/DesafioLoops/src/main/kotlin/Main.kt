fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
    /*
        Crear un rango de numeros y encontrar una forma de recorrer esos numeros y mostrar si esos numeros son
        pares o impares, si el numero es impar pasarlo de largo pero si el numero es par mostrarlo por consola.
        A su vez crear una estructura que acumule los numeros pares mostrados y muestre la sumatoria total por consola
     */

    var number: Int = 1
    print("Ingrese un numero mayor que 1: ")
    var otroNumero: Int = readln().toInt()
    var acumulador: Int = 0
    var cantNumeros: Int = 0
    for (num in number..otroNumero){
        if (num % 2 == 0 ) {
            println("El numero par encontrado es: $num")
            cantNumeros++
            acumulador+= num
        }
    }
    println("El total acumulado es: $acumulador y se encontraron $cantNumeros numeros pares.")
}