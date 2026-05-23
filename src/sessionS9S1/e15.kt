package sessionS9S1

data class Estudiante(
    val nombre: String,
    val edad: Int,
    val promedio: Double
)

// Función para mostrar información del estudiante
fun mostrarInformacion(estudiante: Estudiante) {

    println("\n--- Información del sessionS9S2.Estudiante ---")
    println("Nombre: ${estudiante.nombre}")
    println("Edad: ${estudiante.edad}")
    println("Promedio: ${estudiante.promedio}")

    // Verificar si está aprobado
    if (estudiante.promedio >= 13) {
        println("Estado: Aprobado")
    } else {
        println("Estado: Desaprobado")
    }
}

fun main() {

    // Pedir datos al usuario
    print("Ingrese el nombre: ")
    val nombre = readLine()!!

    print("Ingrese la edad: ")
    val edad = readLine()!!.toInt()

    print("Ingrese el promedio: ")
    val promedio = readLine()!!.toDouble()

    // Crear objeto estudiante
    val estudiante = Estudiante(nombre, edad, promedio)

    // Mostrar información
    mostrarInformacion(estudiante)
}