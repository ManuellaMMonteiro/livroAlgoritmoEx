
    /* algoritmo 67 
    Efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula: 
    prestação = valor + (valor*(taxa/100)*tempo). */ 
        
    fun main() {
        
        println("Digite o valor da prestação: ")
        val valor = readln().toDouble()
        
        println("Digite a taxa: ")
        val taxa = readln().toDouble()
        
        println("Digite o tempo(número de meses): ")
        val tempo = readln().toDouble()
        
        val prestacao = valor + (valor * (taxa / 100) * tempo)
        println("O valor da prestação é: $prestacao")
    }