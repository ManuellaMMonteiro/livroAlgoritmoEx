
    /* algoritmo 117 
    Entrar com três números e armazenar o maior número na variável de nome maior 
    (suponha números diferentes) */
        
    fun main() {
        println("Digite 1º número:")
        val a = readln().toDouble()

        println("Digite 2º número:")
        val b = readln().toDouble()

        println("Digite 3º número:")
        val c = readln().toDouble()

        var maior: Double
        if (a > b) {
            maior = a
        } else {
            maior = b
        }

        if (c > maior) {
            maior = c
        }

        println("Maior: $maior")
    }
    