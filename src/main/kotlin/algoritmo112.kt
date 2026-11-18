
    /* algoritmo 112 
    Entrar com dois números e imprimir o menor numero (suponha números diferentes). 
     */
    
    fun main() {
        println("Digite o 1º número: ")
        val a= readln().toInt()
        
        println("Digite o 2º número: ")
        val b= readln().toInt()
        
        if(a < b){
            println("menor: $a")
        }else{
            println("menor: $b")
        }
    }