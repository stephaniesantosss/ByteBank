package br.com.alura.array

fun testandoRange() {
    //ou pode ser 0..10
    val serie: IntRange = 1.rangeTo(10)

    //dentro do for o in vai armazendando valor por valor no s
    for (s in serie) {
        println("$s")
    }

    println("---------------------------------------")

    val numerosPares = 0..100 step 2
    for (n in numerosPares) {
        println("$n")
    }

    println("---------------------------------------")

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach({ println("$it") })

    println("---------------------------------------")

    val intervalo = 1500..5000
    val salario = 5000

    //dentro do if o in verifica se salario está dentro de intervalo
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    println("---------------------------------------")

    val alfabeto = 'a'..'z'
    val letra = 'k'

    println(letra in alfabeto)
}