package br.com.alura.array

fun testandoIncrementoDeIndexComArrays() {
    val salarios: DoubleArray = doubleArrayOf(1500.25, 2300.0, 5000.0, 8000.0, 10000.0)
    val aumento = 1.1

    //acessando index e incrementando

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }

    println(salarios.contentToString())

    //acessando index e incrementando

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
}