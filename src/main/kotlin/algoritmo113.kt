
    /* algoritmo 113 
    Entrar com dois números e imprimi-los em ordem crescente (suponha números 
    diferentes).
     */
    
    fun main() {
        println("Digite o 1º número: ")
        val a= readln().toInt()
        
        println("Digite o 2º número: ")
        val b= readln().toInt()
        
        if(a<b){
            println("$a, $b")
        }else{
            println("$b, $a")
        }
    }