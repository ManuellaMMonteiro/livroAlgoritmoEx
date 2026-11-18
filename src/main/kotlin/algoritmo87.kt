
    // algoritmo 87 
    // Criar um algoritmo que permita ao aluno responder qual a capital do Brasil. 
    // Todas as possibilidades deverão ser pensadas. 

    fun main() {
        println("Qual a capital do Brasil?")
        val resposta: String = readln()
        
        if(resposta == "BRASÍLIA" || resposta == "Brasília"){
            println("PARABÉNS!")    
        } else if (resposta == "brasília" || resposta == "BRASÍLIA" || resposta == "Brazília" || resposta == "brazília") {
            println("CERTO! Mas atenção para a grafia: Brasília ou BRASÍLIA")
        } else {
            println("ERRADO! ESTUDE MAIS!")
        }
    }