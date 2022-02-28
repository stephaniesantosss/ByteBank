fun testaFuncionario() {
    val alex = Analista(
        nome = "Alex",
        cpf = "123.456.789-00",
        salario = 3000.00
    )

    val jhony = Gerente(
        nome = "Jhony",
        cpf = "222.222.222-22",
        salario = 5000.00,
        senha = 123456
    )

    val john = Diretor(
        nome = "John",
        cpf = "333.333.333-33",
        salario = 10000.00,
        senha = 1234,
        plr = 10000.00
    )

    val mel = Analista(
        nome = "Mel",
        cpf = "333.333.333-44",
        salario = 10000.00
    )

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salario: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao}")

    println("-----------------------")

    println("Nome: ${jhony.nome}")
    println("CPF: ${jhony.cpf}")
    println("Salario: ${jhony.salario}")
    println("Bonificação: ${jhony.bonificacao}")

    if (jhony.autentica(123456)) {
        println("Atenticado com sucesso")
    } else {
        println("Falha na autenticação")
    }

    println("-----------------------")

    println("Nome: ${john.nome}")
    println("CPF: ${john.cpf}")
    println("Salario: ${john.salario}")
    println("PLR: ${john.plr}")
    println("Bonificação: ${john.bonificacao}")

    if (john.autentica(1234)) {
        println("Atenticado com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(john)
    calculadora.registra(alex)
    calculadora.registra(jhony)
    calculadora.registra(mel)

    println("Total de bonificação: ${calculadora.total}")
}