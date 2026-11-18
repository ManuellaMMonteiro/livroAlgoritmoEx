
    /*  algoritmo 81 
    Criar um algoritmo que, dado um número de conta corrente com três dígitos,
    retorne o seu dígito verificador, o qual é calculado da seguinte maneira: 
    Exemplo: número da conta: 235 
        Somar o número da conta com o seu inverso: 235+ 532 = 767 
        multiplicar cada dígito pela sua ordem posicional e somar estes resultados: 767 
            7 6 7 
            Xl X2 X3 
            7 + 12 + 21 =40 
    o último dígito desse resultado é o dígito verificador da conta (40 -> 0). */
       
   
    fun main() {

        var conta: Int
        var numeroMultiplic: Int
        var digito: Int
        var d1: Int
        var d2: Int
        var d3: Int
        var soma: Int

        println("Digite o número de 3 dígitos da conta: ")
        conta = readln().toInt()

        d1 = conta / 100
        d2 = conta % 100 / 10
        d3 = conta % 100 % 10

        numeroMultiplic = d3 * 100 + d2 * 10 + d1

        soma = conta + numeroMultiplic

        d1 = (soma / 100) * 1
        d2 = (soma % 100 / 10) * 2
        d3 = (soma % 100 % 10) * 3

        digito = (d1 + d2 + d3) % 10

        println("Digito verificador: $digito")
    }