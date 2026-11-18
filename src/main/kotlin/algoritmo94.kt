
    /* algoritmo 94 
    Entrar com um número e imprimir uma das mensagens: é multiplo de 3 ou não é 
    multiplo de 3. */
        
    fun main() {
        println("Entre com um número: ")
        var numero: Int = readln().toInt()
        
        if(numero % 3 == 0) {
            println("É múltiplo de 3.")
        } else {
            println("Não é múltiplo de 3.")
        }
    }