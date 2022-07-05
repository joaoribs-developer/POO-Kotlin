open class Funcionario(
    val name: String,
    val cpf: String,
    val salary: Double
    ) {

  open fun paymentBalance(): Double{
        val balance = salary + bonus()
        return balance
    }

   open fun bonus() = salary * 0.02


}