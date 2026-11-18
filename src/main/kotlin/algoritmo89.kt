
    // algoritmo 89
    // peso planetas
    
    fun main() {
        println("Planetas que podem ser analisados:")
        println("1 - Mercurio")
        println("2 - Venus")
        println("3 - Marte")
        println("4 - Jupiter")
        println("5 - Saturno")
        println("6 - Urano")

        println("Escolha o planeta a ser analisado:")
        val planeta = readln().toInt()

        println("Entre com seu peso na Terra:")
        val peso = readln().toDouble()

        when(planeta) {
            1 -> println("Seu peso em Mercurio e: ${(peso / 10) * 0.37}")
            2 -> println("Seu peso em Venus e: ${(peso / 10) * 0.88}")
            3 -> println("Seu peso em Marte e: ${(peso / 10) * 0.38}")
            4 -> println("Seu peso em Jupiter e: ${(peso / 10) * 2.64}")
            5 -> println("Seu peso em Saturno e: ${(peso / 10) * 1.15}")
            6 -> println("Seu peso em Urano e: ${(peso / 10) * 1.17}")
            else -> println("Este planeta não pode ser analisado")
        }
    }