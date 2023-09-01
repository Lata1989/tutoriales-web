

class User (private var nombre: String, private var apellido: String, private var edad: Int){
    /*
        Si oponemos la palabra data delante del nombre de la clase y todo el codigo que generamos antes
        va a ser generado de forma automatica. Tomando los datos definidos en el constructor principal.
        Si no quieres tener los atributos declarados en el equal, hashcode o el toString los eliminas del constructor
        y los dejas declarados de forma interna en la clase.
        En resumen la data Class es la clase que implementa por vos los tres metodos heredados por las clases
        de la clase Any como son equals, toString y hashCode
     */
//data class User (private var nombre: String, private var apellido: String, private var edad: Int){

//    override fun equals(other: Any?): Boolean {
//        if (this === other) {
//            return true
//        }
//
//        if (other is User) {
////            if (this.nombre == other.nombre && this.apellido == other.apellido && this.edad == other.edad){
////                return true
////            }
//            return this.nombre == other.nombre && this.apellido == other.apellido && this.edad == other.edad
//        }
//        else {
//            return false
//        }
////        return super.equals(other)
//    }
//
//    // Si le haces override al equals si o si hay que hacerle override al hashCode
//    override fun hashCode(): Int {
//        return 0
////        return super.hashCode()
//    }
//
//    // Tambien podemos hacerle override al metodo toString() que devuelve la representacion de la clase en String
//    override fun toString(): String {
//        return "User(nombre= '${nombre}', apellido = '${apellido}', edad = ${edad})"
//        return super.toString()
//    }
}