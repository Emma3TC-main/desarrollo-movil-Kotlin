package sessionS9S1

fun main(){
    println("Ingresa tu anio de nacimiento:")
    val anioNacimiento = readln().toInt()

    val anioActual = 2026
    val edad = anioActual - anioNacimiento

    val mensaje = if (edad >= 18) {
        "Eres mayor de edad"
    } else {
        "Eres menor de edad"
    }

    println("Tienes $edad anios. $mensaje")
}