package br.com.alura.array

fun testandoOperacoesAgregadoras() {
    //max traz o maior número dentro de um array
    val idades: IntArray = intArrayOf(10, 18, 12, 40, 67)
    val maiorIdade = idades.max()
    println("Maior idade: $maiorIdade")


    //min traz o menor numero de um array
    val idadeMinima = idades.min()
    println("Menor idade: $idadeMinima")

    //avarege calcula a media
    val media = idades.average()
    println("Media das idades: $media")

    // compara se todos os valores é >= que 18
    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores ? : $todosMaiores")

    //any verifica se existe algum >= 18
    val existeMaior = idades.any { it >= 18 }
    println("Algum aluno é maior de idade? : $existeMaior")

    //filtra a condição que você colocou
    val maiores = idades.filter { it >= 18 }
    println("Maiores de idade: $maiores")

    //find busca o valor que você passou, se tiver mais valores ele retorna somente o primeiro
    val busca = idades.find { it >= 18 }
    println("Busca: $busca")
}