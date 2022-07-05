class Diretor(
     name: String,
     cpf: String,
     salary: Double,
     password: Int,
     val plr: Double = salary * 0.1

    ): Gerente(name, cpf, salary, password) {


    override fun bonus() = salary * 0.1

  override  fun validationPass(password: Int): Boolean {
      var alo = if(this.password == password || this.password == password){
          true
      } else false
      return alo
    }

    override fun paymentBalance() = super.paymentBalance() + plr



}