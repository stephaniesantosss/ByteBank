package br.com.alura.list

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    prateleira.organizarPorAutor().imprimeComMarcadores()
    prateleira.organizarPorAnoDePublicacao().imprimeComMarcadores()
}