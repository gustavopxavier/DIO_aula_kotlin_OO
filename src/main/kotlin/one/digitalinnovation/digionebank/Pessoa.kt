package one.digitalinnovation.digionebank

//Criando classe pessoa
class Pessoa {
    var nome: String = "Gustavo"
    var cpf: String = "123.123.123-12"
    private set

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val gustavo = Pessoa()

    println(gustavo.pessoaInfo())
}