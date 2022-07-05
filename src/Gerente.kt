open class Gerente(
     name: String,
     cpf: String,
     salary: Double,
     val password: Int

    ):Funcionario(name, cpf, salary) {


    override fun bonus() = salary * 0.05

    override fun paymentBalance() = super.paymentBalance()


   open fun validationPass(password: Int):Boolean
    { if(this.password == password || this.password == password){
        return true
    }else return false
    }



}