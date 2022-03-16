package br.com.alura.setMap

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun main() {}

fun testaApplyAlso() {
    val endereco = Endereco()

    //LET
    endereco.let {
        //função de escopo
        //Opera com resultado de uma ou mais funções e com valores nulos
        //cria variavel com um escopo mais limitado com alguma modificação
    }

    //APPLY
    endereco.apply {
        //Receptor
        //Recebe e retorna o objeto no contexto
        //Configura o objeto de contexto sem fazer computações
        //Praticamente diz: "Aplique as seguintes atribuições ao objeto"
    }

    //ALSO
    endereco.also {
        //Argumento
        //Igual ao apply em retorno
        //Realiza ações a mais que não modificam o objeto
        //A remoção do also não deve afetar o programa
        //Praticamente ele diz: "também faça isso"
    }
}

fun testaRun(): Double {
    val endereco = Endereco()

    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("taxa mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Stephanie", cpf = "123.456.789-88", senha = 123), 1000)
    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let(::println)

    val rendimentoTotal = run {
        var saldo = contaPoupanca.saldo
        //quantas vezes ele vai repetir
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    return rendimentoTotal

    //RUN
    endereco.run {
        //Similar a proposta do let, mas o uso é parecido com with
        //Utilizado na inicialização de um objeto
        //Retorna a computação do objeto
    }
    run {
        //Run sem extensão/ sem objeto de contexto
        //Similar a execução do with, mas não recebe nenhum objeto
        //Executa um bloco de código e retorna sua computação
    }
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua A"
        numero = 321
        bairro = "Bairro B"
        cidade = "São Paulo"
        estado = "SP"
        cep = "12345688"
        complemento = "ABC"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }

    val endereco = Endereco()
    //WITH
    with(endereco) {
        //Receptor
        //não é uma extensão de função
        //chama membros do objeto de contexto diretamente
        //Também é usado para computar algo com o receptor e retorna o valor
        //Praticamente ele diz: "com esse objeto, faça"
    }
}





