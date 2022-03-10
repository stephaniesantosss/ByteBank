package br.com.alura.list

fun main() {
    val livro = Livro(
        titulo = "A",
        autor = "Jose",
        anoPublicacao = 2021
    )

    val livro1 = Livro(
        titulo = "B",
        autor = "Maria",
        anoPublicacao = 2022
    )

    val livro2 = Livro(
        titulo = "C",
        autor = "Pedro",
        anoPublicacao = 2019
    )

    val livro3 = Livro(
        titulo = "D",
        autor = "Joao",
        anoPublicacao = 2025
    )

    val livros: MutableList<Livro> = mutableListOf(livro, livro1, livro2, livro3)

    livros.imprimeComMarcadores()

    val ordenadoPorAnoPublicacao = livros.sorted()
    ordenadoPorAnoPublicacao.imprimeComMarcadores()

    livros.sortedBy { it.titulo }.imprimeComMarcadores()

    livros.filter { it.autor == "Joao" }.imprimeComMarcadores()
    val titulos = livros.filter { it.autor.startsWith("Joao") }
        .map { it.titulo }

    println(titulos)


}