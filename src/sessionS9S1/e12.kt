package sessionS9S1

fun suma(a: Double, b: Double) = a + b
fun resta(a: Double, b: Double) = a - b
fun multiplicar(a: Double, b: Double) = a * b
fun dividir(a: Double, b: Double) = if (b!= 0.0) a / b else Double.NaN

fun main(){
    println("Ingresa el primer número:")
    val num1 = readln().toDouble()

    println("Ingresa el segundo número:")
    val num2 = readln().toDouble()

    println("\nResultados:")
    println("Suma:  ${suma(num1,num2)}")
    println("Resta:  ${resta(num1,num2)}")
    println("Multiplicación:  ${multiplicar(num1,num2)}")
    println("División:  ${dividir(num1,num2)}")
}