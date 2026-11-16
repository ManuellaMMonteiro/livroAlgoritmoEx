
    /* algoritmo 55 
    Criar um algoritmo que calcule e imprima a área de um losango. */
        
    fun main() {
    
    var diagMaior: Double
    var diagMenor: Double
    var area: Double

    println("Medida da diagonal maior: ")
    diagMaior = readln().toDouble()

    println("Medida da diagonal menor: ")
    diagMenor = readln().toDouble()

    area = (diagMaior * diagMenor) / 2

    println("Area = $area")
    }