package br.com.alura.setMap

import br.com.alura.bytebank.modelo.Endereco

fun testaFuncoesDeEscopo(): Endereco {
    val endereco = Endereco(logradouro = "rua A", numero = 1)
    val enderecoToUpperCase = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    println(enderecoToUpperCase)

    endereco.let { e ->
        "${e.logradouro}, ${e.numero}".toUpperCase()
    }.let(::println)

    listOf(Endereco(complemento = "casa"), Endereco(complemento = "Apartamento"), Endereco())
        .filter { en -> en.complemento.isNotEmpty() }
        .let(::println)
    return endereco
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("soma sendo efetuada")
    resultado(a + b)
}

fun testeRecebeString(valor: String) {

}