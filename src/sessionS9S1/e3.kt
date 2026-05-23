package sessionS9S1

fun main(){
    val nombre: String = "María"
    val edad: Int = 22

    // interpolación de string (muy potente)
    println("Hola, me llamo $nombre y tengo $edad anios")

    // expresiones dentro de $()
    println("En 5 años tendré ${edad + 5} anios")

    // String multilínea
    val mensaje = """
        Este es un texto
        multilínea en Kotlin.
        Nombre: $nombre
    """.trimIndent()

    println(mensaje)
}