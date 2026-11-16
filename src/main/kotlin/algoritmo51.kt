
    /* algoritmo 51 
    Entrar com o raio de um cfrculo e imprimir a seguinte saída: 
    perimetro: 
    area: */

import kotlin.math.pow
        
    fun main() {
        
        var raio: Double
        var perimetro: Double
        var area: Double
        
        println("Digite o raio: ")
        raio = readln().toDouble()
        
        perimetro = 2 * kotlin.math.PI * raio
        area = kotlin.math.PI * raio.pow(2)
        
        println("perimetro= $perimetro")
        println("area= $area")
}