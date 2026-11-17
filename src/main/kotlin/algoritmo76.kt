
    /* algoritmo 76 
    Criar um algoritmo que leia um número entre O e 60 e imprimir o seu sucessor,
    sabendo que o sucessor de 60 é 0. Não pode ser utilizado nenhum comando de
    seleção e nem de repetição. */ 
        
    fun main() {
    
        println("Digite um número entre 0 e 60:")
        val numero = readln().toInt()

        val sucessor = (numero + 1) % 61

        println("Sucessor: $sucessor")
    }