
    /* algoritmo 65 
    Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
    volume = 3.14159 * R2 * altura. */
        
    fun main() {
        
    println("Digite a altura da lata:")
    val altura = readln().toDouble()

    println("Digite o raio da lata:")
    val raio = readln().toDouble()

    val volume = 3.14159 * raio * raio * altura

    println("O volume da lata é= $volume")
    }