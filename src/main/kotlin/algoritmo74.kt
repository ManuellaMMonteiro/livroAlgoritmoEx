
    /* algoritmo 74
    Para vários tributos, a base de cálculo é o salário mínimo. Fazer um algoritmo que 
    leia o valor do salário mínimo e o valor do salário de uma pessoa. Calcular e
    imprimir quantos salários mínimos ela ganha. 
     */
    
    fun main() {
    
        println("Entre com o salário mínimo: ")
        val salarioMinimo = readln().toFloat()

        println("Entre com o salário de uma pessoa: ")
        val salario = readln().toFloat()

        val quantidadeSalarios = salario / salarioMinimo

        println("A pessoa ganha $quantidadeSalarios salários mínimos.")
}