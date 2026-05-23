package sessionS9S1

fun main() {

    // Pedir la nota al usuario
    print("Ingrese una nota (0 - 20): ")
    val nota = readLine()!!.toInt()

    // Evaluar la nota
    val calificacion = when (nota) {

        in 18..20 -> "Excelente"

        in 15..17 -> "Muy Bueno"

        in 12..14 -> "Bueno"

        in 10..11 -> "Aprobado"

        in 0..9 -> "Desaprobado"

        else -> "Nota inválida"
    }

    // Mostrar resultado
    println("Calificación: $calificacion")
}