fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    /*
        Interfaces son usadas cuando tienes un comportamiento compartido por distintas clases pero no debes
        otorgar el funcionamiento en esa interfaz, solo debes definir el nombre del metodo y los parametros que utiliza,
        el codigo va en las clases que implementan esa interfaz. Por ej una clase auto que representa a un auto y un camion
        y tambien representa a un avion, esos tres objetos tienen un metodo que se llama iniciarMotor(), no es problema
        de la interfaz que codigo va dentro de eso porque eso le corresponde a cada clase que toma comportamientos
        de la interfaz. No sabemos como lo implementa cada clase.
        Las interfaces no tienen constructores porque no se pueden crear objetos de esas interfaces. Las interfaces
        son creadas para que las clases las implementen.
     */

    var unAuto = Car("Peugeot", "Plateado")
    var unCamion = Truck("Mercedes Benz", "Blanco")
    var unAvion = Plane("Boeing", "Blanco y azul")
    var unTesla = Tesla("Tesla", "Bordo")

    unAuto.encenderMotor()
    unCamion.encenderMotor()
    unAvion.encenderMotor()

    // Ultima linea del main
}