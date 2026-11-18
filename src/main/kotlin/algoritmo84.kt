
    /* algoritmo 84 
    Ler um número e imprimir se ele é par ou ímpar. */ 
        
    fun main() {
    
        println("Digite um numero: ")
        val numero = readln().toInt()
        
        if(numero % 2 == 0) {
            println("PAR")
        } else {
            println("ÍMPAR")
        }
    }