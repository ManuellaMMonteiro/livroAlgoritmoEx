
    /* algoritmo 78 
    Dado um polígono convexo de n lados, podemos calcular o número de diagonais 
    diferentes (nd) desse polígono pela fórmula : nd = n (n —3)/ 2. Fazer um 
    algoritmo que leia quantos lados tem o polígono, calcule e escreva o número
    de diagonais diferentes (nd) do mesmo. 
    */
    
    fun main() {
        
        println("Digite o número de lados do polígono:")
        val numeroLados = readln().toInt()

        val numeroDiagonais = numeroLados * (numeroLados - 3) / 2

        println("Número de diagonais: $numeroDiagonais")
    }