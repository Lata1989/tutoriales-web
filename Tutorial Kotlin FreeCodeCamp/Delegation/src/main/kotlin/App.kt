//class App: FirstDelegate(), SecondDelegate { // De esta forma no funciona porque solamente deberia heredar de una clase

class App: A by FirstDelegate(), B by SecondDelegate(){

    /*
        De esta forma podemos delegar de muchos lados o sea heredar e implementar interfaces de muchas interfaces
     */
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun print2() {
        TODO("Not yet implemented")
    }
}