
    /* algoritmo 93 
    Entrar com um número e imprimir a raiz quadrada do número caso ele seja 
    positivo e o quadrado do número caso ele seja negativo. */
     
    fun main() {
        println("Digite um numero:")
        val numero = readln().toDouble()

        if (numero > 0) {
            println("Raiz: ${kotlin.math.sqrt(numero)}")
        } else if (numero < 0) {
            println("Quadrado: ${numero * numero}")
        }
    }
