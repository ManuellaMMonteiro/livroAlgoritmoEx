
    /* algoritmo 77 
    Ler dois números reais e imprimir o quadrado da diferença do primeiro valor
    pelo segundo e a diferença dos quadrados. */
        
    fun main() {
        
        println("Digite o primeiro número:")
        val number1 = readln().toDouble()

        println("Digite o segundo número:")
        val number2 = readln().toDouble()

        val quadradoDiferenca = (number1 - number2) * (number1 - number2)
        val diferencaQuadrados = number1 * number1 - number2 * number2

        println("O quadrado da diferença = $quadradoDiferenca")
        println("Diferença dos quadrados = $diferencaQuadrados")
    }