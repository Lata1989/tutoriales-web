class BankAccount (private var name: String){
    private var balance: Double = 0.0
    private var transacciones = mutableListOf<Double>()

    public fun getNombre():String {
        return this.name
    }
    public fun getBalance():Double {
        return this.balance
    }
    public fun getTrans(): List<Double> {
        return transacciones
    }

    public fun depositar(monto: Double) {
        if (monto > 0) {
            this.balance += monto
            transacciones.add(monto)
            println("El monto de positado es $${monto} y el balance actual es $${balance}")
        }
        else {
            println("No es posible depositar montos negativos.")
        }
    }
    public fun retirar(monto: Double) {
        if (monto > 0 && monto <= this.balance) {
            this.balance -= monto
            transacciones.add(-monto)
            println("El monto de retirado es $${monto} y el balance actual es $${balance}")
        }
        else if(monto > this.balance){
            println("No es posible retirar mas dinero del disponible en la cuenta")
        }
        else{
            println("No es posible retirar saldo negativo.")
        }
    }

    public fun calcularBalance(): Double {
        this.balance = 0.0
        println("Su balance actual es de $0.00")
        for (transaccion in transacciones) {
            balance += transaccion
            println("Tras el movimiento de $$transaccion su balance es de $$balance.")
        }
        println("Su balance final en la cuenta es de $$balance.")
        return this.balance
    }

}