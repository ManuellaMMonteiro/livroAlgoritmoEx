
    /* algoritmo 75 
    Criar um algoritmo que leia o peso de uma pessoa, só a parte inteira, calcular e 
    imprimir: 
    o peso da pessoa em gramas 
    novo peso em gramas se a pessoa engordar 12% */
        
    fun main() {

        println("Entre com seu peso inteiro:")
        val peso = readln().toInt()

        val gramas = peso * 1000
        val novoPeso = (gramas * 1.12).toInt()

        println("Peso em gramas: $gramas")
        println("Novo peso em gramas: $novoPeso")
}