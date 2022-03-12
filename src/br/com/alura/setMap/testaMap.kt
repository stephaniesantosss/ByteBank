package br.com.alura.setMap

fun testaMap() {
    //Pair ou to é usado para armazenar valores para o nosso map
    //Só usar o to se não for muitos, pois ele pode ter perda de performance
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 30.0),
        3 to 50.0
    )
    println(pedidos)
    val pedido = pedidos[4]

    pedido?.let {
        println("Pedido: $it")
    }

    for (p in pedidos) {
        println("Numero do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 800.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    //putIfAbsent só vai add se o valor não for existente
    pedidos.putIfAbsent(6, 90.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 950.0)
    println(pedidos)
    pedidos.remove(6)
    println(pedidos)
    //sobrecarga, só vai remover o 3 se o valor foi igual
    pedidos.remove(3, 100.0)
    println(pedidos)
}