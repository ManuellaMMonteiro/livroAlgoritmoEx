
    /* algoritmo 52 
    Entrar com o lado de um quadrado e imprimir: 
    perimetro: 
    area: 
    diagonal: */
        
    fun main() {
    
        var lado: Double
        var perimetro: Double
        var area: Double
        var diagonal: Double
        
        println("Digite o lado do quadrado: ")
        lado = readln().toDouble()
        
        perimetro = 4 * lado
        area = lado * lado
        diagonal = kotlin.math.sqrt(2.0) * lado
        
        println("perimetro: $perimetro")
        println("area: $area")
        println("diagonal: $diagonal")
        
    }