import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class FormatDelegate : ReadWriteProperty<Any?, String> {
    private var formattedString: String = ""

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
//        TODO("Not yet implemented")
        return formattedString
    }
//    override fun getValue(
//        thisRef.Any?
//    property: KProperty<*>
//    ): String
//    {
//        return formattedString
//    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
//        TODO("Not yet implemented")
        formattedString = value.lowercase()
    }

}