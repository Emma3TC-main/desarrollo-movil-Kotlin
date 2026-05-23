package sessionS9S2

class Estudiante2(
    private var nombre: String,
    private var nota1: Double,
    private var nota2: Double
){
    fun promedio(): Double {
        return (nota1 + nota2)/2
    }

    fun mostrarResultado(){
        println("Alumno: $nombre")
        println("Promedio: ${promedio()}")
        if (promedio() >= 11){
            println("Aprobado")
        }
        else {
            println("Desaprobado")
        }
    }
}

fun main(){
    val alumno1 = Estudiante2("Carlos",15.2, 18.0)
    alumno1.mostrarResultado()
}