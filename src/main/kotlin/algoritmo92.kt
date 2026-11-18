
    /* algoritmo 92 
    Construir um algoritmo que leia dois números e efetue a adição. Caso o valor 
    somado seja maior que 20, este deverá ser apresentado somando-se a ele mais 8; 
    caso o valor somado seja menor ou igual a 20, este deverá ser apresentado sub
    traindo-se 5. */
        
    fun main() {
        println("Digite um número: ")
        val number1 = readln().toInt()
        
        println("Digite outro número: ")
        val number2 = readln().toInt()
        
        var adicao: Int = number1 + number2 
        if(adicao > 20) {
            println("${adicao+8}")
        } else if(adicao <= 20) {
            println("${adicao-5}")
        }
    }