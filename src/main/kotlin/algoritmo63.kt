
    /* algoritmo 63 
    Criar um algoritmo que efetue o cálculo do salário líquido de um professor. Os dados
    fornecidos serão: valor da hora aula, número de aulas dadas no mês e
    percentual de desconto do INSS. */ 
        
    fun main() {
    
        println("Horas trabalhadas:")
        val horas = readln().toInt()

        println("Valor da hora-aula:")
        val valorHora = readln().toDouble()

        println("Percentual de desconto:")
        val percentualDesconto = readln().toDouble()

        val salarioBruto = horas * valorHora
        val totalDesconto = (percentualDesconto / 100) * salarioBruto
        val salarioLiquido = salarioBruto - totalDesconto

        println("Salario liquido: $salarioLiquido")
}