package sessionS9S2

class Persona{
    var nombre: String=""
    var edad: Int = 0

    fun presentarse(){
        println("Hola me llamo $nombre y tengo $edad anios")
    }

}

fun main(){
    val persona1 = Persona()
    persona1.nombre = "Maria"
    persona1.edad = 23

    persona1.presentarse()

}