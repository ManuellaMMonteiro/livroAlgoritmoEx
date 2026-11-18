
    /* algoritmo 109 
    Criar um algoritmo que entre com dois nomes e imprimi-los em ordem alfabética. */
        
    fun main() {
        println("Entrar com 1º nome: ")
        val nome1=readln()
        
        println("Entrar com 2º nome: ")
        val nome2=readln()
        
        if(nome1 < nome2){
            println("$nome1 $nome2")
        } else {
            println("$nome2 $nome1")
        }
    }