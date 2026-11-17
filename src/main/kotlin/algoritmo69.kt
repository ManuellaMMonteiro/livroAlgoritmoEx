
    /* algoritmo 69 
    Criar um algoritmo que leia o numerador e o denominador de uma fração e
    transformá-lo em um número decimal. */
        
    fun main() {
        
        println("Digite o numerador: ")
        val numerador = readln().toDouble()

        println("Digite o denominador: ")
        val denominador = readln().toDouble()

        val decimal = numerador / denominador
        println("Decimal: $decimal")
    }