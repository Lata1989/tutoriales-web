fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
    /*
        Delegation: Es darle el poder de autoridad a una clase sobre otra clase. Normalmente se utiliza en escenarios
        donde la herencia empieza a romperse. El caso mas normal seria cuando necesitas heredar de dos clases.
        Pero con Delegation pueden insertar la implementacion de varias clases en tu propia clase.
     */

    val user = User()
    with(user) {
        firstName = "Latita"
        lastName = "de la Iglesia"

    }

    with(user) {
        println(firstName)
        println(lastName)

    }


    // Ultima linea del main
}