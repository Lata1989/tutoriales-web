fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
/*
    Las colecciones se pueden dividir en dos grupos, inmutables y mutables, son tres tipos de colecciones.
    - List:
    - Set:
    - Map:
 */

    /*
        List
     */
    // Lista inmutable, no se puede modificar
//    val nombres = listOf<String>("Latita", "Noelia", "Panchito", "Felipe")
////    println(nombres[0])
//
//    val nombres2 = mutableListOf<String>("Latita", "Noelia", "Panchito", "Felipe")
////    println(nombres2[0])
//    /*
//        En las listas mutables podemos insertar o sacar elementos
//     */
//
//    nombres2.add("Miguel")
//
//
//    nombres2.forEach {
//        println(it)
//    }
//    nombres2.remove("Miguel")
//
//    println("-- Se elimino un elemento --")
//    nombres2.forEach {
//        println(it)
//    }
//
//    println("Ahora el set")
//
//    val nombres3 = setOf<String>("Latita", "Noelia", "Panchito", "Felipe")
//    val nombres4 = mutableSetOf<String>("Latita", "Noelia", "Panchito", "Felipe")
//    nombres4.add("Miguel")
//    nombres4.forEach {
//        println(it)
//    }

    /*
        Las diferencias entre mapa, lista y set son:
        Mapa: Asocian valores con claves.
        Listas: Agrupan elementos de un mismo tipo sin importar si hay valores duplicados.
        Set: Es un tipo especial de lista donde no se permiten valores duplicados.
     */

//    val user1 = User("Latita")
//    val user2 = User("Noelia")
//    val user3 = User("Panchito")
//    val user4 = User("Felipe")
//    val user5 = User("Miguel")
//    val user6 = User("Nelva")
//    val user7 = User("Nelva")
//
//    println("Ahora el set de objetos")
//    val nombresUsuarios = mutableSetOf<User>(user1,user2,user3,user4,user5,user6,user7,)
//    nombresUsuarios.forEach {
//        println(it.nombre)
//    }

//    val usuarios = mapOf<Int, String>(1 to "Latita", 2 to "Noelia", 3 to "Panchito", 4 to "Felipe")
    val usuarios = mutableMapOf<Int, String>(1 to "Latita", 2 to "Noelia", 3 to "Panchito", 4 to "Felipe")

    usuarios.forEach { t, u ->
        println("$t es la clave del valor $u")
    }

    usuarios[5] = "Miguel"
    println("Se agrego un elemento")
    usuarios.forEach { t, u ->
        println("$t es la clave del valor $u")
    }

    usuarios.remove(5)
    println("Se elimino un elemento")
    usuarios.forEach { t, u ->
        println("$t es la clave del valor $u")
    }


}