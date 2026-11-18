
    /* algoritmo 97 
    Entrar com um número e informar se ele é divisível por 10, por 5, por 2 
    ou se não é divisível por nenhum destes. */
        
    fun main() {
        println("Entre com um número: ")
        var numero: Int = readln().toInt()
        
        if(numero % 10 == 0) {
            println("Múltiplo de 10")
        } else if(numero % 5 == 0) {
            println("Múltiplo de 5")            
        } else if(numero % 2 == 0) {
            println("Múltiplo de 2")
        } else {
            println("Não é múltiplo de 10, nem de 5, nem de 2")
        } 
    }s