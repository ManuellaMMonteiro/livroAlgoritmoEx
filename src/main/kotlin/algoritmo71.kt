
    /* algoritmo 71 
    Criar um algoritmo que leia um valor de hora e informe quantos minutos se 
    passaram desde o início do dia. */ 
        
    fun main() {
        
        println("Entre com o valor da hora: ")
        val hora = readln().toInt()
        
        println("Entre com o valor dos minutos: ")
        val minute = readln().toInt()
        
        val minutos = hora * 60 + minute
        println("Desde o início do dia se passaram $minutos minutos.")
    }