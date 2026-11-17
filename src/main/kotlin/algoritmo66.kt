
    /* algoritmo 66 
    Efetuar o cálculo da quantidade de litros de combustível gastos em uma viagem, 
    sabendo-se que o carro faz 12 km com um litro. Deverão ser fornecidos o tempo 
    gasto na viagem e a velocidade média.
    Utilizar as seguintes fórmulas: distância = tempo x velocidade. litros usados = distância / 12. 
    O algoritmo deverá apresentar os valores da velocidade média, tempo gasto na viagem, distância
    percorrida e a quantidade de litros utilizados na viagem. 
    */
    
    fun main() {
 
    val tempoGasto: Double = 10.0
    val velocidadeMedia: Double = 80.0

    val distancia = tempoGasto * velocidadeMedia
    val litrosUsados = distancia / 12

    println("Velocidade média: $velocidadeMedia km/h")
    println("Tempo gasto: $tempoGasto horas")
    println("Distância percorrida: $distancia km")
    println("Litros utilizados: $litrosUsados L")
    }