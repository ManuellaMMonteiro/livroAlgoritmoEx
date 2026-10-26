
    /* algoritmo 28
    Imprimir a mensagem: "É PRECISO FAZER TODOS OS ALGORITMOS PARA
    APRENDER".
    */

fun main () {
    println()
    println("É preciso fazer todos os algoritmos para aprender")

    /* algoritmo 29
    Imprimir seu nome.
    */

    val nome: String = "Julia"
    println()
    println("Meu nome é $nome")

    /* algoritmo 30
    Criar um algoritmo que imprima o produto entre 28 e 43
    */

    val produto: Int = 28*43
    println()
    println("O produto entre 28 e 43 é: $produto")

    /* algoritmo 31
    Criar um algoritmo que imprima a média aritmética
    entre os números 8, 9 e 7.
    */

    var media: Double = (8 + 9 + 7)/3.0
    println()
    println("O resultado da média aritmética: $media")

    /* algoritmo 32
    Ler um número inteiro e imprimi-lo.
    */

    println()
    println("Entre com um número: ")
    var inteiro: Int = readln().toInt()

    println("Número: $inteiro")

    /* algoritmo 33
    Ler dois números inteiros e imprimi-los.
    */

    println()
    println("Entre com um número: ")
    val num1: Int = readln().toInt()

    println("Entre com outro número: ")
    val num2: Int = readln().toInt()

    println("Número 1: $num1")
    println("Número 2: $num2")

    /* algoritmo 34
    Ler um número inteiro e imprimir seu sucessor e seu antecessor.
    */

    println()
    println("Entre com um número: ")
    var num: Int = readln().toInt()

    var ant: Int = num - 1
    var suc: Int = num + 1
    println("Sucessor: $suc, Antecessor: $ant")

    /* algoritmo 35
    Ler nome, endereço e telefone e imprimi-los.
    */

    println()
    println("Entre com nome: ")
    val nom3: String = readln()

    println("Entre com endereço: ")
    val endereco: String = readln()

    println("Entre com telefone: ")
    val telefone: String = readln()

    println("Nome: $nom3")
    println("Endereço: $endereco")
    println("Telefone: $telefone")

    /* algoritmo 36
    Ler dois números inteiros e imprimir a soma. Antes do resultado, deverá aparecer
    a mensagem: Soma.
    */

    println("Entre com um número: ")
    val numInt1: Int = readln().toInt()

    println("Entre com um número: ")
    val numInt2: Int = readln().toInt()

    val soma: Int = numInt1 + numInt2
    println("Soma: $soma")

    /* algoritmo 37
    Ler dois números inteiros e imprimir o produto.
     */

    println()
    println("Entre com um número inteiro: ")
    val number: Int = readln().toInt()
    println("Entre com um número inteiro: ")
    val number0: Int = readln().toInt()

    val prod: Int = number * number0
    println("Produto: $prod")

    /* algoritmo 38
    Ler um numero real e imprimir a terça parte deste numero.
     */

    println("Entre com um número real: ")
    val numberReal: Double = readln().toDouble

    println("A terça parte é: ${numberReal/3}")
}