package br.com.alura.setMap

fun testaCopia() {
    val banco = BancoDeNomes()
    banco.salva("Steh")
    println(banco.nomes)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    //toList() devolve uma cópia da lista
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }

}