package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {

    val joao = Analista("João Paulino", "123456789",20000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}