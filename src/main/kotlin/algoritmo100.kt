
    /* algoritmo 100 
    Ler um número inteiro de 4 casas e imprimir se é ou não múltiplo de quatro o 
    número formado pelos algarismos que estão nas casas das unidades de milhar e das 
    centenas. */
        
    fun main() {
        println("Digite um número de 4 algarismos:")
        val num = readln().toInt()

        val c = num / 100

        if (c % 4 == 0) {
            println("O número é múltiplo de 4: $c")
        } else {
            println("O número não é múltiplo de 4: $c")
        }
    }