fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    var exito = Resultado.Success("Exito!!!!")
    var falladoRecuperable = Resultado.Error.RecoverableError(Exception(),"Fallo recuperable!!!!")
    var falladoNoRecuperable = Resultado.Error.RecoverableError(Exception(),"Fallo no recuperable!!!!")
    var progresando = Resultado.Progreso("En progreso!!!!")
    getData(exito)
    getData(falladoRecuperable)
    getData(falladoNoRecuperable)
    getData(progresando)
}

fun getData(resultado: Resultado) {
    when(resultado) {
//        is Resultado.Error -> resultado.mostrarMensaje()
//        is Resultado.Success -> resultado.mostrarMensaje()
//        is Resultado.Progreso -> resultado.mostrarMensaje()
//        else -> println("Viva Peron!") // Esta opcion no se ejecutaria nunca
        is Resultado.Error.NonRecoverableError -> resultado.mostrarMensaje()
        is Resultado.Error.RecoverableError -> resultado.mostrarMensaje()
        is Resultado.Progreso -> resultado.mostrarMensaje()
        is Resultado.Success -> resultado.mostrarMensaje()
    }
}