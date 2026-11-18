
    /* algoritmo 95 
    Entrar com um número e informar se ele é ou não divisível por 5. */ 
        
    fun main() {
        println("Entre com um número: ")
        var numero: Int = readln().toInt()
        
        if(numero % 5 == 0) {
            println("É divisível por 5")
        }else{
            println("Não é divisível por 5")
        }
    }