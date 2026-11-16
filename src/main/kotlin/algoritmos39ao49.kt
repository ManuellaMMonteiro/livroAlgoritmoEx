import kotlin.math.PI
import kotlin.math.sin
import kotlin.math.cos
import kotlin.math.tan
import kotlin.math.log10
import kotlin.math.log

    fun main () {
    /* algoritmo 39
    Entrar com dois numeros reais e imprimir a media aritmética com a mensagem
    "media" antes do resultado
     */
        println("Entre com a 1° nota: ")
        val note: Double = readln().toDouble()

        println("Entre com a 2° nota: ")
        val note2: Double = readln().toDouble()

        val media: Double = (note+note2)/2.0
        println("Média: $media")

    /* algoritmo 40
    Entrar com dois numeros inteiros e imprimir a seguinte saída:
    dividendo:
    divisor:
    quociente:
    resto:
         */

        println()
        println("Entre com o dividendo: ")
        val valor1: Double = readln().toDouble()

        println("Entre com o divisor: ")
        val valor2: Double = readln().toDouble()

        val quoc: Double = valor1 / valor2
        val rest: Double = valor1 % valor2

        println("Dividendo: $valor1")
        println("Divisor: $valor2")
        println("Quociente: $quoc")
        println("Resto: $rest")

    /* algoritmo 41
    Entrar com quatro números e imprimir a média ponderada, sabendo-se que os
    pesos são respectivamente: 1, 2, 3 e 4.
     */

        val mp: Double

        println()
        println("Entre com um número: ")
        val n1: Int = readln().toInt()

        println("Entre com um número: ")
        val n2: Int = readln().toInt()

        println("Entre com um número: ")
        val n3: Int = readln().toInt()

        println("Entre com um número: ")
        val n4: Int = readln().toInt()

        mp = (n1*1 + n2*2 + n3*3 + n4*4)/(1.0+2.0+3.0+4.0)
        println("Resultado da média ponderada: $mp")

    /* algoritmo 42
    Entrar com um ângulo em graus e imprimir: seno, co-seno, tangente, secante,
    co-secante e co-tangente deste ângulo.
     */

        println()
        println("Digite um ângulo em graus: ")
        val angulo: Double = readln().toDouble()

        val rang = angulo * PI / 180.0

        println("Seno: ${sin(rang)}")
        println("Co-seno: ${cos(rang)}")
        println("Tangente: ${tan(rang)}")
        println("Co-secante: ${1.0/sin(rang)}")
        println("Secante: ${1.0/cos(rang)}")
        println("Co-tangente: ${1.0/tan(rang)}")

    /* algoritmo 43
    Entrar com um número e imprimir o logaritmo desse número na base 10.
     */
        println("Entre com logaritmando: ")
        val number: Double = readln().toDouble()

        val logaritmo: Double = log10(number)
        println("Logaritmo: $logaritmo")

    /* algoritmo 44
    Entrar com o número e a base em que se deseja calcular o logaritmo desse número e imprimi-lo.
     */
        println("Entre com o logaritmando: ")
        val num: Double = readln().toDouble()

        println("Entre com a base: ")
        val base = readln().toDouble()

        val loga: Double = log(num, base)
        println("O logaritmo de $num na base $base é: $loga")

    /* algoritmo 45
    Entrar com um número e imprimir a seguinte saída:
    numero:
    quadrado:
    raiz quadrada:
     */

        println()
        println("Entre com um número: ")
        val numero: Double = readln().toDouble()

        val quad: Double = numero*numero
        val raiz = Math.sqrt(numero)

        println("Número: $numero")
        println("Quadrado: $quad")
        println("Raiz quadrada: $raiz")

    /* algoritmo 46
    Fazer um algoritmo que possa entrar com o saldo de uma aplicação e imprima o
    novo saldo, considerando o reajuste de 1%.
     */
        println("Digite um saldo: ")
        val saldo: Double = readln().toDouble()

        val newsaldo: Double = saldo * 1.01

        println("Novo saldo: $newsaldo")

    /* algoritmo 47
    Entrar com um número no formato CDU e imprimir invertido: UDC. (Exemplo:
    123, sairá 321.) O número deverá ser armazenado em outra variável antes de ser
    impresso.
     */
        println("Entre com um número de 3 dígitos: ")
        val num3: Int = readln().toInt()

        val c: Int = num3/100
        val d = num3 % 100 / 10
        val u = num3 % 10

        val numIn = u * 100 + d * 10 + c

        println("Número: $num3")
        println("Invertido: $numIn")

    /* algoritmo 48
    Antes de o racionamento de energia ser decretado, quase ninguém falava em
    quilowatts; mas, agora, todos incorporaram essa palavra em seu vocabulário. Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo,
    fazer um algoritmo que receba o valor do salário mínimo e a quantidade de quilowatts gasta por uma residência e calcule. Imprima:
    o valor em reais de cada quilowatt, o valor em reais a ser pago, o novo valor a ser pago por essa residência com um desconto de 10%. */

        println("Entre com o salário mínimo: ")
        val sm: Double = readln().toDouble()

        println("Entre com a quantidade de quilowatts gasta: ")
        val gasta = readln().toDouble()

        val preco = sm / 7.0 / 100.0
        val vp = preco * gasta
        val vd = vp * 0.9

        println("Preço do quilowatt: R$ $preco")
        println("Valor a ser pago: R$ $vp")
        println("Valor com desconto: R$ $vd")

    /* algoritmo 49
    Entrar com um nome e imprimir:
    todo nome:
    primeiro caractere:
    ultimo caractere:
    do primeiro ate o terceiro:
    quarto caractere:
    todos menos o primeiro:
    os dois ultimos:
     */
        println("Entre com um nome: ")
        val nome = readln()

        println("Todo nome: $nome")
        println("Primeiro caractere: ${nome[0]}")
        println("Último caractere: ${nome[nome.length - 1]}")
        println("Do primeiro ao terceiro: ${nome.substring(0, 3)}")
        println("Quarto caractere: ${nome[3]}")
        println("Todos menos o primeiro: ${nome.substring(1)}")
        println("Os dois últimos: ${nome.substring(nome.length - 2)}")
    }