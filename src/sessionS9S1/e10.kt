package sessionS9S1

fun main() {
    println("Ingresa un numero para ver su tabla de multiplicar:")
    val num = readln().toInt()

    println("Tabla del $num:")

    //Uso de rango en for
    for (i in 1 .. 10) {
        println("$num X $i = ${num * i}")
    }
}