package br.com.alura.setMap

fun testandoGroup() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 80.0),
        Pedido(4, 30.0)
    )

    println(pedidos)
//    val pedidosMapeados = pedidos.associate { pedido: Pedido ->
//        Pair(pedido.numero, pedido)
//    }

    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }

    println(pedidosMapeados)
    println(pedidosMapeados[2])

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(1, 20.0)])

//    val mapa = pedidos.associateBy { pedido ->
//        pedido.valor > 50.0
//    }
//
//    println(mapa)

    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf(
        "Maria",
        "João",
        "Pedro",
        "Belinha",
        "JHony",
        "Stephanie",
        "Tom",
        "Doris",
        "John"
    )

    val agenda = nomes.groupBy { nome ->
        nome.first()
    }

    println(agenda)
    println(agenda['J'])
}

data class Pedido(val numero: Int, val valor: Double)