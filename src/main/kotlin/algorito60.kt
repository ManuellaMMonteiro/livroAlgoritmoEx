
    /* algoritmo 60 
    Entrar com a razão de uma PA e o valor do 1º termo.
    Calcular e imprimir o 10º termo da série.
     */

 
    fun main() {

    var dec: Int
    var razao: Int
    var termo: Int

    println("Entrar com o 1º termo: ")
    termo = readln().toInt()

    println("Entrar com a razão: ")
    razao = readln().toInt()

    dec = termo + 9 * razao

    println("O 10º termo desta P.A. é: $dec")
}
