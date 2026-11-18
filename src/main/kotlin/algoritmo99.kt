
    /* algoritmo 99 
    Ler um número inteiro de 3 casas decimais e imprimir se o algarismo da casa das 
    centenas é par ou ímpar. */
        
    fun main() {
        println("Digite um número de 3 algarismos:")
        val num = readln().toInt()

        val centena = num / 100

        if(centena % 2 == 0) {
            println("O algarismo da centenas é par: $centena")
        } else {
            println("O algarismo da centenas é ímpar: $centena")
        }
    }