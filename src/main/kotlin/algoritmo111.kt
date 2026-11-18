
    /* algoritmo 111 
    Entrar com dois números e imprimir o maior número (suponha números diferentes). */
        
    fun main() {
        println("Digite o 1º número: ")
        val a= readln().toInt()
        
        println("Digite o 2º número: ")
        val b= readln().toInt()
        
        if(a > b){
            println("maior: $a")
        }else{
            println("maior: $b")
        }
    }