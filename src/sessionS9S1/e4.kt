package sessionS9S1

fun main(){
    val edad: Int = 17
    val categoria = if (edad >= 18) "Adulto" else "Menor"

    println(categoria)

    val nota = 16
    val resultado = when (nota) {
        20 -> "Excelente"
        in 16..19 -> "Muy bueno"
        in 13 .. 15 -> "Bueno"
        in 10 .. 12 -> "Aprobado"
        else -> "Desaprobado"
    }

    println("Resultado: $resultado")

    //Bucles for y while
    // for con rango
    for (i in 1..5){
        println("Número $i \t")
    }

    // for con step
    for(i in 10 downTo 1 step 2){
        println("Cuenta regresiva : $i")
    }

    // while
    var contador = 3
    while (contador > 0) {
        println("contador; $contador")
        contador--
    }

}