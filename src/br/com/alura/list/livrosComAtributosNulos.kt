package br.com.alura.list

fun main() {
    listaDeLivros
            //elvis operator quando pode vir null mas não queremos mostrar que está nulo, entao definimos um texto padrão
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String?, livros: List<Livro?>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}