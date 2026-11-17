
    /* algoritmo 70 
    Todo restaurante embora por lei não possa obrigar o cliente a pagar, cobra 10% 
    para o garçom. Fazer um algoritmo que leia o valor gasto com despesas realizadas
    em um restaurante e imprima o valor total com a gorjeta. */
        
    fun main() {

        println("Entre com o valor da conta:")
        val valorConta = readln().toFloat()

        val valorTotal = valorConta * 1.10f

        println("O valor da conta com a gorjeta será: $valorTotal")
    }