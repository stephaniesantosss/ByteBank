package br.com.alura.list

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        //ele filtra só vai passar por ele se não for null
        .filterNotNull()
        .joinToString(separator = "\n") {
            //safeCall
            " - ${it.titulo} de ${it.autor}"
        }

    println(" ####### Lista de Livros ######## \n$textoFormatado")
}