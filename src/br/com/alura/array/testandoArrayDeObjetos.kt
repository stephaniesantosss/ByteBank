package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

fun testandoArrayDeObjetos() {
    //usando string eu garanto que valor vai ser exatamente esse, e não vai sofrer com arredondamento
    val salarios = bigDecimalArrayOf("1500.55", "3500.51", "2150.00", "1354.50", "8500.55")

    println("Salarios: ${salarios.contentToString()}")

    val aumento = "1.1".toBigDecimal()

    val salariosComAumentos: Array<BigDecimal> = salarios.map { salario ->
        calculaAumentoRelativo(salario, aumento)
    }.toTypedArray()

    println("Salarios com aumento: ${salariosComAumentos.contentToString()}")

    val gastoInicial = salariosComAumentos.somatoria()
    println("Gasto inicial: $gastoInicial")

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumentos.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println("Gasto total: $gastoTotal")

    val salariosOrdenados = salariosComAumentos.sorted()
    //takeLast pega os tres ultimos elementos e o take pega os 3 primeiros
    val tresUltimoSalario = salariosOrdenados.takeLast(3).toTypedArray()
    val media = tresUltimoSalario.media()
    println("Media: $media")

    //ou

    val mediaResumida = salariosComAumentos
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    val mediamMenoresSalarios = salariosComAumentos
        .sorted()
        .take(3)
        .toTypedArray()
        .media()

    println("Media: $mediaResumida")
    println("Media Menores Salarios: $mediamMenoresSalarios")
}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal {
    return if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        //setScale é usado pra definir quantas casas decimais
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}

