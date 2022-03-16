package br.com.alura.setMap

//imprime a referencia do metodo
//println(minhaFuncaoLambda)
//imprime a execução do metodo
//println(minhaFuncaoLambda(10, 20))

//a ultima instrução é o retorno lambda implicito
//funcao lambda //qd não for utilizado o parametro no lamba colocar "_" no lugar
val minhaFuncaoLambda = funcaoLambda()

//label lambda@ é usado quando dentro do meu lambda pode ter mais de um tipo de retorno
val calculaBonificacao: (salario: Double) -> Double = funcaoLambdaCalculadora()

fun funcaoLambdaCalculadora(): (salario: Double) -> Double {
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        salario + 100.00
    }
    return calculaBonificacao
}

fun funcaoLambda(): (Int, Int) -> Int {
    val minhaFuncaoLambda = { a: Int, b: Int ->
        println("Executa Como Lambda")
        a + b
    }
    return minhaFuncaoLambda
}