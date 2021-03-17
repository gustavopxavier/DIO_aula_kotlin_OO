package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {

    val maria = Gerente("Maria Paulino", "123456789",5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)

}