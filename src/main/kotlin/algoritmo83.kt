
    /* algoritmo 83 
    Ler um número e, se ele for positivo, imprimir seu inverso; caso contrário, 
    imprimir o valor absoluto do número. 
     */
    
    fun main() {
        
        var numero: Double
        var inverso: Double
        var absoluto: Double

        println("Digite um numero: ")
        numero = readln().toDouble()

        if (numero > 0) {

            inverso = 1.0 / numero
            println("Inverso: $inverso")

        } else {

            absoluto = numero * (-1)
            println("Absoluto: $absoluto")

        }
    }