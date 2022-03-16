package br.com.alura.setMap

fun testaHOF() {
    somaReceiver(1, 21, resultado = (::println))

    soma(1, 5) {
        println(it)
    }

    //higher order function
    "".let(::testeRecebeString)

    1.let {
        it
    }
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}