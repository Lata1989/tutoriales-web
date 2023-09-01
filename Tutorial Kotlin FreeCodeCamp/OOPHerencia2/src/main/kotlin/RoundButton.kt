class RoundButton(texto: String, orientacion: String, private var corners: Int): Button(texto, orientacion) {

    override fun dibujar() {
        //Vale por codigo de creacion de boton.
        println("Dibujando el boton redondo.")
//        super.dibujar()
    }

}