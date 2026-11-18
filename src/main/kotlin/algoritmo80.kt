
    /* algoritmo 80 
    Criar um algoritmo que leia a quantidade de fitas que uma locadora de vídeo pos
    sui e o valor que ela cobra por cada aluguel, mostrando as informações pedidas a 
    seguir: 
         Sabendo que um terço das fitas são alugadas por mês, exiba o 
        faturamento anual da locadora; 
         Quando o cliente atrasa a entrega, é cobrada uma multa de 10% sobre o 
        valor do aluguel. Sabendo que um décimo das fitas alugadas no mês são 
        devolvidas com atraso, calcule o valor ganho com multas por mês; 
         Sabendo ainda que 2% de fitas se estragam ao longo do ano, e um décimo 
        do total é comprado para reposição, exiba a quantidade de fitas que a locadora 
        terá no final do ano. */
            
    fun main() {

    var fitas: Int
    var valAluguel: Double
    var faturamentoAnual: Double
    var multas: Double
    var quantFinal: Double

    print("Digite a quantidade de fitas: ")
    fitas = readln().toInt()

    print("Digite o valor do aluguel: ")
    valAluguel = readln().toDouble()

    faturamentoAnual = (fitas / 3.0) * valAluguel * 12

    multas = (valAluguel * 0.1) * ((fitas / 3.0) / 10)
    
    quantFinal = fitas - (fitas * 0.02) + (fitas / 10.0)
    
    println("Faturamento anual: $faturamentoAnual")
    println("Multas mensais: $multas")
    println("Quantidade de fitas no final do ano: $quantFinal")
    }