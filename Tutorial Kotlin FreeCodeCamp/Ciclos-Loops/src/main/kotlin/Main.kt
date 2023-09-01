fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    // Ciclo For

//    for (i in 1..100) { //1..100 es un rango
//        println(" i = $i")
//    }

//    for (i in 1 until 100) {
//        println("i =  $i")
//    }

//    for (i in 100 downTo  1) {
//        println("i =  $i")
//    }

//    for (i in 1 until  100 step 3) {
//        println("i =  $i")
//    }

//    for (i in 100 downTo  1 step 5) {
//        println("i =  $i")
//    }

//    for (i in 100 .. 1) {
//        println("i =  $i")
//    }

    // Ciclo while


//    var contador: Int = 0
//    while (contador<10){
//        println("Contador = $contador")
//        contador++
//    }


// Break y Continue en ciclo while

    var num: Int = 0

    while (num <10 ) {
        num++
        if (num == 8){
            continue
        }
        println("Num = $num")
    }
    println("Cambio de While")

    num = 0
    while (num <10 ) {
        num++
        if (num > 2 && num < 5){
            println("Continue")
            continue
        }
        // Otra forma
        if (num in 2..5){
            println("Continue")
            continue
        }
        println("Num = $num")
    }
    println("Cambio de While")

    num = 0
    while (num <10 ) {
        num++
        if (num == 8){
            println("Break")
            break
        }
        println("Num = $num")
    }

    var otroNumero: Int = 0

    outer@ while (otroNumero < 5) {
        otroNumero++
        println("El valor de numero es: $otroNumero")
        var i: Int = 0
        while (i < 5) {
            if (i == 0) break@outer
            i++
            println("****$i")
        }
    }


    // Ciclo do-while

//    var numero: Int = 0
//    do {
//        println("Numero = $numero")
//        numero++
//    } while (numero<=10)

}

