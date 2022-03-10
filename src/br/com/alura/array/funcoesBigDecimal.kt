package br.com.alura.array

import java.math.BigDecimal

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    //cria um array de bigDecimal dinamico já que no kotlin não existe essa impl
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

//extensionFunction
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}