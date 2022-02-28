fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Jhony",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Stephanie",
        numero = 1010
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo cc: ${contaCorrente.saldo}")
    println("Saldo cp: ${contaPoupanca.saldo}")
    println("-----------------------")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo cc: ${contaCorrente.saldo}")
    println("Saldo cp: ${contaPoupanca.saldo}")
    println("-----------------------")

    contaCorrente.transfere(120.0, contaPoupanca)

    println("Saldo cc: ${contaCorrente.saldo}")
    println("Saldo cp: ${contaPoupanca.saldo}")
    println("-----------------------")

    contaPoupanca.transfere(500.0, contaCorrente)

    println("Saldo cc: ${contaCorrente.saldo}")
    println("Saldo cp: ${contaPoupanca.saldo}")
    println("-----------------------")
}