
    /* algoritmo 96 
    Entrar com um número e informar se ele é divisível por 3 e por 7. 
     */
    
    fun main() {
        println("Entre com um número: ")
        var numero: Int = readln().toInt()
        
        if(numero % 3 == 0 && numero % 7 == 0) {
            println("É divisível por 3 e por 7.")
        } else {
            println("Não é divisível")
        }
    }