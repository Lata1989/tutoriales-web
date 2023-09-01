import java.lang.Exception

//enum class Resultado {
//    SUCCCESS,
//    ERROR
//}
/*
    El enum no nos dejan codificar mas informacion porque los enum no pueden tener atributos y para eso
    tenemos que utilizar "sealedClasses"
 */

sealed class Resultado(private var mensaje: String) {

    fun mostrarMensaje() {
        println("Resultado: $mensaje.")
    }

    /*
        Todas las subclases de la sealed class son conocidas por el compilador. Por ende el compilador puede
        declarar por nosotros y llenar todas las posibilidades. Lo que nos da mas poder que los Enums porque
        pueden tener un monton de propiedades
     */
    class Success(mensaje: String): Resultado(mensaje) {

    }

    sealed class Error(mensaje: String): Resultado(mensaje) {
        class RecoverableError(exception: Exception, mensaje: String): Error(mensaje){

        }
        class NonRecoverableError(exception: Exception, mensaje: String): Error(mensaje){

        }
    }

    class Progreso(mensaje: String): Resultado(mensaje){

    }
}