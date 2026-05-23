package sessionS9S1

fun main(){
    println("Ingresa la temperatura en Celsius:")
    val celsius = readln().toDouble()

    //Fórmula de conversión
    val fahrenheit = (celsius * 9/5) + 32

    println("$celsius °C = ${"%.2f".format(fahrenheit)} °F")
}