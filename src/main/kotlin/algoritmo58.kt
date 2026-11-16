
    /* algoritmo 58 
    Entrar com valores para xnum 1, xnum2 e xnum3 e imprimir o valor de x, sabendo-se que: 
    X = xnuml + xnum2/(xnum3 + xnuml) 
    + 2(xnuml - xnum2) + 1 log 64 2 
     */
    
    
    import kotlin.math.log

    fun main() {

    var xnum1: Double
    var xnum2: Double
    var xnum3: Double
    var x: Double

    println("Entrar com 1° valor: ")
    xnum1 = readln().toDouble()

    println("Entrar com 2° valor: ")
    xnum2 = readln().toDouble()

    println("Entrar com 3° valor: ")
    xnum3 = readln().toDouble()

    x = xnum1 + xnum2 / (xnum3 + xnum1) +
        2 * (xnum1 - xnum2) + log(64.0, 2.0)

    println("X = $x")
}
