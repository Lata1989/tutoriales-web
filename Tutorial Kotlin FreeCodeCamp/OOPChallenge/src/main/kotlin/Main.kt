fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    /*
        Crear una clase que represente una cuenta bancaria de una persona y esta clase va a tener tres atributos
        nombre de la cuenta - balance de la cuenta - transacciones (lista mutable) y tener metodos para depositar,
        retirar y calcular balance. Los controles se deben aplicar.
     */
    val cuentaPablo = BankAccount("Latitarg")

    cuentaPablo.depositar(36.48.toDouble())
    cuentaPablo.depositar(45.toDouble())
    cuentaPablo.depositar(-45.toDouble())
    cuentaPablo.retirar(25.toDouble())
    cuentaPablo.retirar(16.36.toDouble())
    cuentaPablo.retirar(60.36.toDouble())
    println("El balance de la cuenta de ${cuentaPablo.getNombre()} es de $${cuentaPablo.getBalance()}")
    cuentaPablo.calcularBalance()
//    cuentaPablo.balance = 3000



    //Ultima linea del main
}