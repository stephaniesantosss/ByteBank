package br.com.alura.bytebank.teste

fun testaExpressao() {
    try {
        10 / 0
    } catch (e: ArithmeticException) {
        println(e.printStackTrace())
    }
    val entrada: String = "1,9"

    //try expression
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    //if expression
    val comTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }
}