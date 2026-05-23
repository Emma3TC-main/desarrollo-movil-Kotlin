package sessionS9S2// Getter and Setter

class CuentaBancaria(val titular: String){
    private
        var saldoInterno: Double = 0.0;

    var saldo: Double
        get() = saldoInterno
        set(valor) {
            if (valor >=0 ) {
                saldoInterno = valor
            } else {
                println("Error, saldo no puede ser negativo")
            }

        }

    fun depositar(cantidad: Double) {
        saldo += cantidad
    }
}

fun main(){
    val cuenta = CuentaBancaria("Emmanuel Misael")
    cuenta.depositar(550.90)
    println("Saldo: ${cuenta.saldo}")

}

