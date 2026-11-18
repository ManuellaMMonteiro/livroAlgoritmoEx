
    /* algoritmo 110 
    Criar um algoritmo que leia dois números e imprimir uma mensagem dizendo se 
    são iguais ou diferentes. */
        
    fun main() {
        println("Digite o 1º número: ")
        val a= readln().toInt()
        
        println("Digite o 2º número: ")
        val b= readln().toInt()
        
        if(a == b){
            println("iguais")
        }else{
            println("diferentes")
        }
    }