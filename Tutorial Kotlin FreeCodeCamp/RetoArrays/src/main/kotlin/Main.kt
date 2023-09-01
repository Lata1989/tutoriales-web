fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
    /*
    Reto: Crear una funcion que va a tomar como argumento un array de enteros, tienes que determinar que numero es el
    mayor y devolverlo y tienes que hacer una funcion que va a devolver el menor. Tienes que encontrar la forma de
    hacerlo en una sola funcion.
     */
    var elArray: Array<Int> = arrayOf(0, 9, 1, 8, 7, 3, 45, 36, 6, 4, 5)
//    println("El mayor valor en el array es: ${buscarMax(elArray)}")
//    println("El menor valor en el array es: ${buscarMin(elArray)}")
//    var maximo: Int = buscarMax(elArray)
//    var minimo: Int = buscarMin(elArray)
//    print("El valor maximo encontrado es $maximo y el minimo es $minimo.")
    println(
        "El valor maximo del array es: ${buscarMinYMax(elArray, true)} y el minimo es: ${
            buscarMinYMax(
                elArray,
                false
            )
        }"
    )
    var maximo: Int = buscarMinYMax(elArray, true)
    var minimo: Int = buscarMinYMax(elArray, false)
//    print("El valor maximo encontrado es $maximo y el minimo es $minimo.")
    //Ultima linea del main
}

fun buscarMax(valores: Array<Int>): Int {
    var mayor: Int = valores[0]
    for (i in valores) {
        if (i > mayor) {
            mayor = i
        }
    }
    return mayor
}

fun buscarMin(valores: Array<Int>): Int {
    var menor: Int = valores[0]
    for (i in valores) {
        if (i < menor) {
            menor = i
        }
    }
    return menor
}

fun buscarMinYMax(valores: Array<Int>, buscarMax: Boolean): Int {
    var maximo = valores[0]
    var minimo = maximo
    if (buscarMax) {
        for (numero in valores) {
            if (numero > maximo) {
                maximo = numero
            }
        }
        return maximo
    } else {
        for (numero in valores) {
            if (numero < minimo) {
                minimo = numero
            }
        }
    }
    return minimo
}