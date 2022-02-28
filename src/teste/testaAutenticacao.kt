import modelo.Cliente
import modelo.Diretor
import modelo.Gerente
import modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Stephanie",
        cpf = "123.456.789-99",
        salario = 20.000,
        senha = 5552
    )

    val diretor = Diretor(
        nome = "Jhony",
        cpf = "123.456.789-99",
        salario = 30.000,
        senha = 5555,
        plr = 100.00
    )

    val cliente = Cliente(
        nome = "Belinha",
        cpf = "123.321.456-00",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 5552)
    sistema.entra(diretor, 1023)
    sistema.entra(cliente, 1234)
}