
    /* algoritmo 106 
    Entrar com um nome e imprimi-lo se o primeiro caractere for a letra A (considerar 
    letra minúscula ou maiúscula).
    */
    
    fun main() {
        println("Digite nome:")
        val nome = readln()

        val letra = nome[0]

        if (letra == 'A' || letra == 'a') {
            println(nome)
        }
    }