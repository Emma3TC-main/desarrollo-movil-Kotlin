package sessionS9S1

fun main(){
    // Inmutable (recomendado)
    val nombre: String = "Emmanuel" // no se puede reasignar
    val edad = 25 // Type inference

    // Mutable
    var contador = 0
    contador = 10

    println("Nombre: $nombre, Edad: $edad")
}