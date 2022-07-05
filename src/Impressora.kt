import javax.naming.Context

open interface Impressora {
    var listBitmap : MutableList<String>
    open fun addToPrint (context : Context, texto : String){
        listBitmap.add("Hello World!!")
    }


    companion object Impressao{

        fun addPrint (number: Int, number2: Int): Int{
           var soma = number + number2
            
        return soma
        }

        fun addNewList (list: MutableList<String>){
           // var list12 = listOf<String>("Hello World", "Olá mundo", "Teste de Interface", "E companion object")
            list.addAll(listOf("Hello World", "Olá mundo", "Teste de Interface", "E companion object"))
        }

    }


}
