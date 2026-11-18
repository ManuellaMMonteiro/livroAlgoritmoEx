
    /* algoritmo 105 
    Entrar com a sigla do estado de uma pessoa e imprimir uma das mensagens: 
    carioca 
    paulista 
    mineiro 
    outros estados 
     */
    
    fun main() {
        println("Digite a sigla:")
        val sigla = readln()

        if (sigla == "RJ" || sigla == "rj") {
            println("Carioca")
        } else if (sigla == "SP" || sigla == "sp") {
            println("Paulista")
        } else if (sigla == "MG" || sigla == "mg") {
            println("Mineiro")
        } else {
            println("Outros estados")
        }
    }