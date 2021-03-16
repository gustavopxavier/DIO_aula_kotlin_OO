package one.digitalinnovation.digionebank

//Classe pessoa
class Pessoa {
    var nome: String = "Gustavo"
    var cpf: String = "123.123.123-12"
}

fun main(){
    val gustavo = Pessoa()

    println(gustavo.nome)
    println(gustavo.cpf)
}