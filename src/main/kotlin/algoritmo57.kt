
    /* algoritmo 57 
    Entrar com as notas da PR 1 e PR2 e imprimir a média final:
    truncada: 
    arredondada:
    */
        
    fun main() {
        
        var pr1: Double
        var pr2: Double
        var mf: Double
        
        println("Digite a nota da PR1: ")
        pr1 = readln().toDouble()
        
        println("Digite a nota da PR2: ")
        pr2 = readln().toDouble()
        
        mf = (pr1 + pr2) / 2
        
        println("Média truncada = ${mf.toInt()}")
        println("Média arredondada = ${(mf + 0.5).toInt()}")
    }