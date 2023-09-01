class Usuario public constructor(var nombre: String, var apellido: String, var edad: Int){

    init {
        println("Usuario ${this.nombre} ${this.apellido} creado con exito.")
    }
}