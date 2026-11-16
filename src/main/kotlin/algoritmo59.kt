
    /* algoritmo 59  
    Entrar com os valores dos catetos de um triângulo retângulo e imprimira hipotenusa.
     */
    
    
import kotlin.math.sqrt

    fun main() {

    var a: Double
    var b: Double
    var c: Double

    println("Entrar com 1 cateto: ")
    b = readln().toDouble()

    println("Entrar com 2 cateto: ")
    c = readln().toDouble()

    a = sqrt(b * b + c * c)

    println("A hipotenusa e $a")
}
