package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    //compartilha suas properties e se torna membro da Classe para ser manipulável
    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}