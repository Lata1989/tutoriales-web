class Calculadora() {
    //Companion object
    /*
        El companion object no pertenece al objeto, pertenece a la clase en si.
        Las variables y funciones que se definen en el companion object son llamadas variables y funciones de clase
        No es necesaria una instancia(objeto) para acceder a ellas.
        Es muy potente porque no necesitamos crear un objeto cada vez que necesitamos usar una funcion que se defina
        en la clase.
     */
    companion object {
        var max: Int = 100
        fun sumar(a: Int, b: Int): Int {
            var suma: Int?
            suma = a + b
            return suma
        }
    }

//    fun sumar(a: Int, b: Int): Int {
//        var suma: Int?
//        suma = a + b
//        return suma
//    }

}