package sessionS9S1

fun main() {
    println("Ingresa un número:")
    val numero = readln().toInt()

    val tipo = when {
        numero > 0  -> "Positivo"
        numero < 0 -> "Negativo"
        else -> "Cero"
    }

    val paridad = if (numero % 2 == 0) "Par" else "Impar"
    println("El número $numero es $tipo y es $paridad")
}