
    /* algoritmo 61 
    Entrar com a razão de uma PG e o valor do 1º termo. Calcular e imprimir o 5º termo da série.
     */
    
    fun main() {
        
    var quinto: Int
    var razao: Int
    var termo: Int

    println("Entre com o 1º termo:")
    termo = readln().toInt()

    println("Entre com a razão:")
    razao = readln().toInt()

    quinto = termo * razao * razao * razao * razao

    println("O 5º termo desta P.G. é: $quinto")
    }