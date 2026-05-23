package sessionS9S2

// Clase base
open class Figura {

    open fun dibujar() {
        println("Dibujando figura")
    }
}

// Clase Circulo
class Circulo : Figura() {

    override fun dibujar() {
        println("Dibujando círculo")
    }
}

// Clase Cuadrado
class Cuadrado : Figura() {

    override fun dibujar() {
        println("Dibujando cuadrado")
    }
}

fun main() {

    // Polimorfismo
    val figura1: Figura = Circulo()
    val figura2: Figura = Cuadrado()

    figura1.dibujar()
    figura2.dibujar()
}