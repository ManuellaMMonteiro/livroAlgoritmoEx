
    /* algoritmo 53 
    Entrar com os lados a, b, c de um paralelepípedo. Calcular e imprimir a diagonal. 
    */
    
    fun main() {
    
        var a: Double
        var b: Double
        var c: Double
        var diagonal: Double
        
        println("Entre com a base: ")
        a = readln().toDouble()
        
        println("Entre com a altura: ")
        b = readln().toDouble()
        
        println("Entre com a profundidade: ")
        c = readln().toDouble()
        
        diagonal = kotlin.math.sqrt(a * a + b * b + c * c)
        
        println("diagonal: $diagonal")
    }