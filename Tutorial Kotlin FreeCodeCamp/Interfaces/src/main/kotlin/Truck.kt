class Truck(private var nombre: String, private var color: String): Engine {
    // Implementando la interfaz motor
    override fun encenderMotor() {

        fun getNombreCamion(): String{
            return this.nombre
        }
        fun getColorCamion(): String{
            return this.nombre
        }
//        TODO("Not yet implemented")
        println("El camion esta encendiendo el motor.")

    }
}