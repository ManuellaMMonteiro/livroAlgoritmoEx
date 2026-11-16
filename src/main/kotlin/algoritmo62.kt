
    /* algoritmo 62 
    Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas 
    vendas oferecendo desconto. Faça um algoritmo que possa entrar com o valor de 
    um produto e imprima o novo valor tendo em vista que o desconto foi de 9%. */

    fun main() {
    
    var preco: Double
    var novoPreco: Double

    println("Digite o valor do produto: ")
    preco = readln().toDouble()

    novoPreco = preco * 0.91

    println("Preço com desconto: $novoPreco")
}