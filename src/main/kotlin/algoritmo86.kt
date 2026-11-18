
    // algoritmo 86
    // Ler um número e imprimir se ele é positivo, negativo ou nulo. 
    
    fun main() {
        println("Digite um número: ")
        var numero: Int = readln().toInt()
        
        if(numero > 0) {
            println("POSITIVO")
        } else if(numero < 0) {
            println("NEGATIVO")
        } else {
            println("NULO")
        }
    }