
    // algoritmo 85
    
    fun main() {

        var a: Double
        var b: Double
        var c: Double
        var max: Double

        println("Digite o primeiro número: ")
        a = readln().toDouble()

        println("Digite o segundo número: ")
        b = readln().toDouble()

        println("Digite o terceiro número: ")
        c = readln().toDouble()

        if (a > b) {
            if (a > c) {
                max = a
            } else {
                max = c
            }
        } else {
            if (b > c) {
                max = b
            } else {
                max = c
            }
        }
        println("Maior número: $max")
    }
