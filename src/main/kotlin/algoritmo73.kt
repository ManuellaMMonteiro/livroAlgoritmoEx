
    /* algoritmo 73 
    Criar um algoritmo que receba um número real, calcular e imprimir: 
    a parte inteira do número 
    a parte fracionária do número 
    o número arredondado  */
        
    fun main() {

        println("Entre com um numero com parte fracionária:")
        val numero = readln().toFloat()

        val parteInteira = numero.toInt()
        val parteFracionaria = numero - parteInteira
        val numeroArredondado = (numero + 0.5f).toInt()

        println("Parte inteira: $parteInteira")
        println("Parte fracionaria: $parteFracionaria")
        println("Numero arredondado: $numeroArredondado")
    }