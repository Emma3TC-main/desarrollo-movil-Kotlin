package sessionS9S2

// Crear interfaz
interface Encendido {

    fun encender()
}

// Clase Laptop que implementa la interfaz
class Laptop : Encendido {

    override fun encender() {
        println("Laptop encendida")
    }
}

fun main() {

    // Crear objeto
    val laptop = Laptop()

    // Llamar método
    laptop.encender()
}