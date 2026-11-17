
    /* algoritmo 64 
    Ler uma temperatura em graus centígrados e apresentá-la convertida em graus 
    Fahrenheit. A formula de conversão é: F= 9.c + 160/5 onde F é a temperatura em
    Fahrenheit e C é a temperatura em centígrados. */

    fun main() {
        
        println("Digite o valor da temperatura em graus centigrados:")
        val celsius = readln().toDouble()

        val fahrenheit = (9 * celsius + 160) / 5

        println("O valor da temperatura em graus Fahrenheit é: $fahrenheit")
}