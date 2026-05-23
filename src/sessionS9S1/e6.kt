package sessionS9S1

class Persona (val nombre: String, var edad: Int) {
    fun cumplirAnios(){
        edad++
        println("$nombre cumplio anios. Ahora tiene $edad")
    }
}

// Data class (muy usada en Kotlin)
data class Producto(val nombre: String, val precio: Double)

fun main(){
    val p1 = Persona("Ana", 28)
    p1.cumplirAnios()

    val prod = Producto("Laptop", 899.99)
    println(prod)
}