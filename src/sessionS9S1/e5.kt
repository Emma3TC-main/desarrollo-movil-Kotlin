package sessionS9S1

// función básica
fun saludar(nombre: String){
    println("Hola, $nombre, bienvenido")
}

fun sumar(a: Int, b: Int): Int{
    return a+b
}

// función con parámetros por defecto
fun imprimirMensaje(mensaje: String = "Hola por defecto") {
    println(mensaje)
}


fun main(){
    print(saludar("Carlos"))
    val resultado = sumar(8,10)
    println("La suma es : $resultado")
    imprimirMensaje()
    imprimirMensaje("Mensaje personalizado")
}