
    /* algoritmo 104 
    Entrar com nome, sexo e idade de uma pessoa. Se a pessoa for do sexo feminino e 
    tiver menos que 25 anos, imprimir nome e a mensagem: ACEITA. Caso contrário, 
    imprimir nome e a mensagem: NÃO ACEITA. (Considerar f ou F.)
     */
    
    fun main() {
        println("Digite nome:")
        val nome = readln()

        println("Digite sexo(F ou M):")
        val sexo = readln()

        println("Digite idade:")
        val idade = readln().toInt()

        if ((sexo == "F" || sexo == "f") && idade < 25) {
            println("$nome ACEITA")
        } else {
            println("$nome NAO ACEITA")
        }
    }