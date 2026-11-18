
    /* algoritmo 103 
    Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimira idade da 
    pessoa. Não se esqueça de verificar se o ano de nascimento é um ano válido. 
     */
    
    fun main() {
    println("Entre com ano atual:")
    val anoAtual = readln().toInt()

    println("Entre com ano de nascimento:")
    val anoNasc = readln().toInt()

    if (anoNasc > anoAtual) {
        println("Ano de Nascimento Invalido")
    } else {
        println("Idade: ${anoAtual - anoNasc}")
    }
}