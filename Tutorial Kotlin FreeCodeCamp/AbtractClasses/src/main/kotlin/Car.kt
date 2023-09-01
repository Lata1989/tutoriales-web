class Car(
    private var name: String, private var color: String, private var engines: Int,
    private var doors: Int
) : Vehiculo() {

    // Getters y setters
    public fun getNombre(): String {
        return name
    }

    public fun getColorAuto(): String {
        return color
    }

    public fun getMotores(): Int {
        return engines
    }

    public fun getPuertas(): Int {
        return doors
    }

    // Funciones del auto
    override fun moverse() {
        println("El auto se esta moviendo.")
    }

    override fun detenerse() {
        println("El auto se detuvo.")
    }

}