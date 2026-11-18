
    /* algoritmo 91 
    Construir um algoritmo que leia dois valores numéricos inteiros e efetue a 
    adição; caso o resultado seja maior que 10, apresentá-lo.
    */
    
    fun main() {
        println("Digite um número: ")
        val number1 = readln().toInt()
        
        println("Digite outro número: ")
        val number2 = readln().toInt()
        
        val result = number1 + number2
        
            if(result > 10) {
                println(result)
            }
    } 