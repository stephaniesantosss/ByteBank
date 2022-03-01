import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val endereco = Endereco("rua a", 1, "ABC", "Barueri", "SP","123456", "ap02")
    val jhony = Cliente(nome = "Jhony", cpf = "", senha = 2, endereco = endereco)

    println("Jhony: ${jhony.endereco}")

    val contaCorrente = ContaCorrente(
        titular = jhony,
        numero = 1000
    )

    val stephanie = Cliente(nome = "Stephanie", cpf = "", senha = 1)

    val contaPoupanca = ContaPoupanca(
        titular = stephanie,
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

    contaCorrente.transfere(120.0, contaPoupanca, 2)

    println("Saldo cc: ${contaCorrente.saldo}")
    println("Saldo cp: ${contaPoupanca.saldo}")
    println("-----------------------")

    contaPoupanca.transfere(500.0, contaCorrente, 1)

    println("Saldo cc: ${contaCorrente.saldo}")
    println("Saldo cp: ${contaPoupanca.saldo}")
    println("-----------------------")
}