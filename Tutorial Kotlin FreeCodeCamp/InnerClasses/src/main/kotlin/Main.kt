fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")


    /*
        InnerClasses: Son clases declaradas dentro de otra clase y son utilizadas normalmente cuando dos clases
        estan altamente relacionadas y no vale la pena separarlas. Las clases internas tienen acceso a los
        atributos de la clase exterior
     */
    val listView = ListView(arrayOf("nombre1", "nombre2", "nombre3", "nombre4", "nombre5", "nombre6"))
    listView.ListViewItem().displayItem(2)
    listView.ListViewItem().displayItem(5)
    listView.ListViewItem().displayItem(0)
    // Ultima linea del main
}


class ListView(var items: Array<String>) {


    inner class ListViewItem() {

        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}