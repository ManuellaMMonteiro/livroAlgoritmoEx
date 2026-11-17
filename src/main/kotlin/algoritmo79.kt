
    /* algoritmo 79 
    Uma pessoa resolveu fazer uma aplicação em uma poupança programada. 
    Para calcular seu rendimento, ela deverá fornecer o valor constante da aplicação 
    mensal, a taxa e o número de meses. Sabendo-se que a fórmula usada para este cálculo é: 
    valor acumulado = P * (1+i)n-1/i
    i = taxa 
    P = aplicação mensal 
    n= número de meses 
     */

    fun main() {

        println("Digite o valor da aplicação mensal: ")
        val aplicacaoMensal = readln().toDouble()

        println("Digite a taxa (0 - 1): ")
        val taxa = readln().toDouble()

        println("Digite o número de meses: ")
        val numeroMeses = readln().toInt()

        val valorAcumulado = aplicacaoMensal * (Math.pow(1 + taxa, numeroMeses.toDouble()) - 1) / taxa

        println("O valor acumulado: $valorAcumulado")
}