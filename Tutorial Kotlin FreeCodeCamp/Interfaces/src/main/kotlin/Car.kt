/*
    Las clases deben implementar las interfaces
 */

class Car(private var nombre: String, private var color: String): Engine {

    fun getNombreAuto(): String{
        return this.nombre
    }
    fun getColorAuto(): String{
        return this.nombre
    }

    // La forma de implementar es haciendo un override a los metodos que tienen las interfaces
    override fun encenderMotor() {
//        TODO("Not yet implemented")
        println("El auto esta encendiendo el motor.")

    }
}