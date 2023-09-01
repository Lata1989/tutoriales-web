/*
    Los atributos que la clase hija hereda deben ser colocados como parametros y asignados en el constructor
 */

public class Plane(name: String, color: String, private var engines: Int = 0, private var doors: Int):
    Vehicle(name, color) {

    // Getters y setters
    public fun getMotores(): Int{
        return this.engines
    }
    public fun setMotores(valor: Int): Int {
        this.engines = valor
        return this.engines
    }
    public fun getPuertas(): Int{
        return this.doors
    }
    public fun setPuertas(valor: Int): Int {
        this.doors = valor
        return this.doors
    }

    //Sobreescribiendo funciones del padre con la palabra override
    override fun moverse() {
        volar()
        super.moverse() //super: Hace que se llama el metodo moverse de la clase padre.
    }

    fun volar() {
        println("$name esta volando.")
    }
}