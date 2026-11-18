
    /* algoritmo 98 
    A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários
    estatutários. O valor máximo da prestação não poderá ultrapassar 30% do salário 
    bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da 
    prestação e informar se o empréstimo pode ou não ser concedido. 
    */

    fun main() {
        println("Digite o salário bruto:")
        val sb = readln().toDouble()

        println("Digite o valor da prestação:")
        val prestacao = readln().toDouble()

        if (prestacao <= 0.3 * sb) {
            println("EMPRÉSTIMO CONCEDIDO")
        } else {
            println("EMPRÉSTIMO NEGADO")
        }
    }