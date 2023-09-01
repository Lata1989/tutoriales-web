/*
    Asi se crea una clase abstracta
 */

abstract class Vehiculo{
//    En una interfaz esto no se podria hacer
//    private var text: String = ""

    // Las funciones en la clase abstracta no deben tener las {} porque no pueden implementar logica.
    abstract fun moverse()

    abstract fun detenerse()
}