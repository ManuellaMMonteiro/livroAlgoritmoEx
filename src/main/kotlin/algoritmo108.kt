
    /* algoritmo 108
    Idem ao anterior, porém considerar: JOSÉ, José ou josé. 
    */
    
    fun main() {
        println("Digite o primeiro nome: ")
        val nome = readln()

        if (nome == "JOSÉ" || nome == "José" || nome == "josé") {
            println(nome)
        }
    }