package sessionS9S2

// constructores
class Estudiante(
    val nombre: String,
    var edad: Int,  //esto no se puede cambiar por ser var
    val carrera: String
){
    init {
        println("Se creo automáticamente un estudiante llamado $nombre")
    }

    fun mostrarInfo(){
        println("sessionS9S2.Estudiante: $nombre, $edad anios, estudia $carrera")
    }
}


fun main(){
    val estudiante1 = Estudiante("Ana", 22, "Ingeniería de sistemas")
    estudiante1.mostrarInfo()
}