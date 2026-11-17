
    /* algoritmo 68 
    Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma que a 
    variável A passe a ter o valor da variável B e que a variável B passe a ter o valor da
    variável A. Apresentar os valores trocados. */
        
    fun main() {
        
        println("Entre com o valor de A: ")
        var A = readln().toInt()
        
        println("Entre com o valor de B: ")
        var B = readln().toInt()
        
        var aux = A
        A = B
        B = aux
        
        println("O valor de A é: $A")
        println("O valor de B é: $B")
    }