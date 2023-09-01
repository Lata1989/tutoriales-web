fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    // Si yo utilizo dos veces ese objeto la funcion que implementa esa clase de la interfaz va a ser la misma
    // Por ende todas las funciones que use seria la misma para cada uno de los objetos.
    /*
        Por eso lo que hay que utilizar es la expresion de objetos u ObjectExpression
     */
//    val clickListener = ClickListener()
    val loginButton = Button ("Log in", 1232, object : OnClickListener {
        // Aca adentro vamos a declarar e instancias la clase anonima
        override fun onClick() {
//            TODO("Not yet implemented")
            println("Ejecutando el Log in.")
        }
    })
    val signUpButton = Button ("Sign up", 3212, object : OnClickListener {
        override fun onClick() {
//            TODO("Not yet implemented")
            println("Ejecutando el Sign up.")
        }
    })

    // Ultima linea del main()
}