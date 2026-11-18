
    /* algoritmo 115 
    Criar o algoritmo que deixe entrar com dois números e imprimir o quadrado do 
    menor número e a raiz quadrada do maior número, se for possível. 
     */
    
    fun main() {
        println("Digite valor de x:")
        val x = readln().toDouble()

        println("Digite valor de y:")
        val y = readln().toDouble()

        if (x > y) {
            if (x >= 0) {
                println("Raiz do maior: ${kotlin.math.sqrt(x)}")
            } else {
                println("Não é possivel calcular a raiz do maior numero")
            }
            println("Quadrado do menor: ${y * y}")

        } else if (y > x) {
            if (y >= 0) {
                println("Raiz do maior: ${kotlin.math.sqrt(y)}")
            } else {
                println("Não é possivel calcular a raiz do maior numero")
            }
            println("Quadrado do menor: ${x * x}")
        } else {
            println("Números iguais")
        }
    }