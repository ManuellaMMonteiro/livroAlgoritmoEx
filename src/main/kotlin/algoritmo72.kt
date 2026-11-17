
    /* algoritmo 72 
    Criar um algoritmo que leia o valor de um depósito e o valor da taxa de
    juros. Calcular e imprimir o valor do rendimento e o valor total depois do
    rendimento. */
        
    fun main() {
        
    println("Entre com o valor do depósito: ")
    val deposito = readln().toDouble()

    println("Entre com a taxa de juros:")
    val taxaJuros = readln().toDouble()

    val rendimento = deposito * taxaJuros / 100
    val valorTotal = deposito + rendimento

    println("Rendimento: $rendimento")
    println("Total: $valorTotal")
    }