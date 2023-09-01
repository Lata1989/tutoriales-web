fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
    sayHello()
//    saludar("Pablo")
//    print("Ingrese su nombre: ")
//    var nuevoNombre: String = readln()
//    print("Ingrese su edad: ")
//    var edad: Int = readln().toInt()
//    saludar(nuevoNombre, edad)

//    var tieneInternet: Boolean = true
//    if (tieneInternet) {
//        getData("Algun dato")
//    }
//    else
//    {
//        mostrarMensaje()
//    }
//    println(getMax(9, 5))
//    println(getMax(13, 13))
//    println(getMax(9, 14))
//    println(getMax(9, 8))
//    println(getMax(9.3, 8.8))
//    println(getMax(7.6, 13.5))
    sendMessage("Pablo", "Hola!!!")
    sendMessage("Pablo", )
    sendMessage(message = "Cristina")
    sendMessage(message = "Chupala", name = "Puto")
    sendMessage()

}

fun sayHello() {
    println("Hola mundo!!")
}

fun saludar(nombre: String, anios:Int) {
    println("Hola $nombre tienes $anios años de edad.")
}

fun getData(data: String) {
    println("Tu dato es: $data.")
}

fun mostrarMensaje() {
    println("No hay internet.")
}

fun getMax(num1: Int, num2: Int): Int {
    var max = if (num1 > num2 ) {
        num1
    } else {
        num2
    }
    return max
}

// Functions overloading o sobrecarga de funciones
// Dos funciones que hacen lo mismo, cambiamos el tipo de parametro y solucionado, otra forma es cambiando la
// cantidad de parametros
fun getMax(num1: Double, num2: Double): Double {
    var max = if (num1 > num2 ) {
        num1
    } else {
        num2
    }
    return max
}

// fun getMax(a: Int, b: Int): Int = if (a > b) a else b

// Parametros por defecto o default parameters

fun sendMessage(name: String = "Viva", message: String = sendText()) {
    println("Nombre = $name y mensaje = $message.")
}

fun sendText(): String {
    return "Un texto"
}

// Funcion en una sola linea de codigo

fun enviarMensajeTexto() = "Un texto nuevo"

