class AutenticaCompra {
     var saldoEmpresa = 300000.00
        private set

    fun autorizaCompra (gerente: Gerente, value: Double){
        if (gerente.validationPass(gerente.password))
        { this.saldoEmpresa -= value }


    }
    companion object Impressao{

        fun addPrint (number: Int, number2: Int): Int{
            var soma = number + number2
            return soma
        }
    }


}