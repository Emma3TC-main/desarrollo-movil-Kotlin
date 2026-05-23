package sessionS9S2

// Clase padre
open class Animal {

    fun comer() {
        println("El animal está comiendo")
    }
}

// Clase hija que hereda de Animal
class Gato : Animal() {

    fun maullar() {
        println("Miau Miau")
    }
}

fun main() {

    // Crear objeto de la clase Gato
    val gato = Gato()

    // Llamar métodos heredados y propios
    gato.comer()
    gato.maullar()
}