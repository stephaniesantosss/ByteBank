package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    var enderecoNulo: Endereco? = null
    //safe call
    println(enderecoNulo?.bairro)

    //função de escopo let
    enderecoNulo?.let {
        println(enderecoNulo?.bairro)
        val complementoTamanho: Int = it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser null")
        println(complementoTamanho)
    }
}