package br.com.alura.setMap

fun testaComortamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 30.0),
        3 to 50.0,
        4 to 150.00,
        5 to 101.00,
        6 to 100.0,
        7 to 100.0
    )

    println(pedidos[4])
    println(pedidos.getValue(4))
    //println(pedidos.getValue(5))

    val message = pedidos.getOrElse(8, {
        "Não tem o pedido"
    })

    println(message)
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)

    for (numero in pedidos.keys) {
        println("Pedido: $numero")
    }

    println(pedidos.values)

    for (valor in pedidos.values) {
        println("Valor do pedido: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        //par
        numero % 2 == 0 && valor > 50.0
    }

    println("Pedidos filtrados: $pedidosFiltrados")

    val valorMaiorQue20 = pedidos.filterValues { valor -> valor > 20.0 }
    println(valorMaiorQue20)

    val keyMaiorQue3 = pedidos.filterKeys { key -> key > 3 }
    println(keyMaiorQue3)

    println(pedidos + mapOf(7 to 10.0, 8 to 98.0))
    println(pedidos)

    println(pedidos - 3)
    println(pedidos)

    println(pedidos - listOf(1, 2))
    println(pedidos)

    //pedidos.putAll(setOf(7 to 10.0, 8 to 98.0))
    pedidos += (setOf(7 to 10.0, 8 to 98.0))
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(30.0)
    println(pedidos)

    //remove apenas o primeiro valor que ele encontrar
    pedidos.values.remove(100.0)
    println(pedidos)
}