package sessionS9S1

fun main() {
    // Solicitar el monto de la cuenta
    print("Ingrese el monto de la cuenta: ")
    val cuenta = readLine()!!.toDouble()

    // Solicitar el porcentaje de propina
    print("Ingrese el porcentaje de propina: ")
    val porcentajePropina = readLine()!!.toDouble()

    // Calcular la propina
    val propina = cuenta * (porcentajePropina / 100)

    // Calcular el total a pagar
    val total = cuenta + propina

    // Mostrar resultados
    println("\n--- Resultado ---")
    println("Monto de la propina: S/. $propina")
    println("Total a pagar: S/. $total")
}