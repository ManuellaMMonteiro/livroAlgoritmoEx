
    /* algoritmo 101 
    Construir um algoritmo que indique se o número digitado está compreendido
    entre 20 e 90 ou não. */
        
    fun main() {
        println("Digite um número: ")
        var numero: Int = readln().toInt()
        
        if(numero > 20 && numero < 90) {
            println("O número está na faixa entre 20 a 90.")
        } else {
            println("O número está FORA da faixa entre 20 e 90.")
        }
    }