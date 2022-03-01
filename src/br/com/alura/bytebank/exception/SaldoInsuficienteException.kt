package br.com.alura.bytebank.exception

class SaldoInsuficienteException(
    mensagem: String = "Saldo insuficiente") : Exception(mensagem)