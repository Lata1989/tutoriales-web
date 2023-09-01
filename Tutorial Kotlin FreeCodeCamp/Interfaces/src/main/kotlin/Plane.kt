class Plane(private var nombre: String, private var color: String): Engine {
    override fun encenderMotor() {

        fun getNombreAvion(): String{
            return this.nombre
        }
        fun getColorAvion(): String{
            return this.nombre
        }
//        TODO("Not yet implemented")
        println("El avion esta encendiendo el motor.")
    }
}