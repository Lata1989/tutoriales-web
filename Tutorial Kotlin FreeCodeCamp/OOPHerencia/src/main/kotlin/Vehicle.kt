/*
    Con la palabra "open" hacemos que esta clase sea abierta y otras clases puedan heredar de la clase
    que esta como "open"
    Los atributos que esta clase padre va a otorgar a las clases hijas van a ser pasados como parametros.
 */

open class Vehicle(protected var name: String, protected var color: String) {

    // Getters y setters
    public fun getNombre(): String{
        return name
    }
    public fun setNombre(valor: String): String {
        name = valor
        return name
    }
    public fun getColorVehiculo(): String{
        return color
    }
    public fun setColorVehiculo(valor: String): String {
        color = valor
        return color
    }

    // Funciones propias del vehiculo
    /*
        Para poder hacer override o sea sobreescribir los metodos del padre en los hijos los metodos del padre
        deben ser publicos y "open" es decir abiertos igual que la clase.
     */
    public open fun moverse() {
        println("${name} se esta moviendo.")
    }
    public open fun detenerse() {
        println("${name} se detuvo.")
    }
}