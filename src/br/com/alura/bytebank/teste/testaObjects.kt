package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaObjects() {
    //Object Expression
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "123"
        val senha: Int = 123

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 123)

    println("Nome do cliente: ${fran.nome}")

    val alex = Cliente(nome = "Alex", cpf = "", senha = 233)
    ContaPoupanca(titular = alex, numero = 1000)

    println("Total de contas: ${Conta.total}")
}