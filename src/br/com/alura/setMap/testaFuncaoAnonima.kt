package br.com.alura.setMap


fun testaFuncaoAnonima(): (Int, Int) -> Int {
    //funcao anonima //na funcao anonima é obrigatorio o return
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        println("Executa Como Funcao Anonima")
        return a + b
    }


    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.00
    }

    println(calculaBonificacaoAnonima(1500.0))
    return minhaFuncaoAnonima
}