package br.com.alura.array

fun testandoArrays() {
    val idades = intArrayOf(25, 19, 33, 20, 58, 48, 88)

    var maiorIdade = 0

    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("A maior idade é: $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println("A menor idade é: $menorIdade")
}