//functions repository


fun funcTesteKotlin() {
    val contaAlex = Conta(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)


    println("---------------------------")

    testaLacos()
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("João", 1002)
    contaJoao.titular = "João"
    var contaMaria = Conta("Maria", 1003)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

    for (i in 5 downTo 1) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}

fun TestaFuncionarios() {
    val geisa = Gerente(name = "Geisa", cpf = "111.111.111-11", salary = 2000.0, password = 123456)
    val eliane = Gerente("Eliane", "333.444.555-78", salary = 2100.0, password = 123321)
    val joao = Funcionario(name = "João Vitor", cpf = "222.222.222.22", salary = 1200.0)
    val Fifi = Diretor("Fiona", "444.555.666-77", 4000.0, 1234)


    if (geisa.validationPass(123456)) {
        println("Usuário valido")
    } else println("Usuário inválido")

    println("-------------")
    if (eliane.validationPass(123684)) {
        println("Usuário valido")
    } else println("Usuário inválido")

    println("-------------")

    println(Fifi.paymentBalance())
    println(geisa.paymentBalance())
    println(joao.paymentBalance())

    println("-------------")
    var autentic = AutenticaCompra()
    autentic.autorizaCompra(eliane, 153483.0)
    println(autentic.saldoEmpresa)
    autentic.autorizaCompra(eliane, 122853.0)
    println(autentic.saldoEmpresa)
    autentic.autorizaCompra(eliane, 1583.0)
    println(autentic.saldoEmpresa)
}