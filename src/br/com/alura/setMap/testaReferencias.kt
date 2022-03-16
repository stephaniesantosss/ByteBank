package br.com.alura.setMap

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse = Soma()
    println(minhaFuncaoClasse(13, 21))
}

fun testaTipoFuncaoReferencia() {
    //() -> Unit esse é o tipo função //::teste referencia
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(3, 11))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}