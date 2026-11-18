
    /* algoritmo 116 
    Entrar com três números e imprimir o maior número (suponha números diferentes). 
     */
    
    fun main() {
        println("Digite 1º número:")
        val a = readln().toDouble()

        println("Digite 2º número:")
        val b = readln().toDouble()

        println("Digite 3º número:")
        val c = readln().toDouble()

        if (a > b) {
            if (a > c) {
                println("Maior: $a")
            } else {
                println("Maior: $c")
            }
        } else {
            if (b > c) {
                println("Maior: $b")
            } else {
                println("Maior: $c")
            }
        }
    }