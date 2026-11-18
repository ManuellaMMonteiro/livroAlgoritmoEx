
    /* algoritmo 102 
    Entrar com um número e imprimir uma das mensagens: maior do que 20, igual a 
    20 ou menor do que 20. */
    
    fun main() {
        println("Entre com um número: ")
        var num = readln().toInt()
        
        if(num > 20) {
            println("Maior que 20")
        } else if(num == 20) {
            println("Igual a 20")
        } else {
            println("Menor que 20")
        }
    }