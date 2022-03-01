package br.com.alura.bytebank.exception

class FalhaAutenticacaoException(
    message: String = "Falha na autenticação"
) : Exception(message) {
}