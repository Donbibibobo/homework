package train.com

import java.util.*

fun main(args: Array<String>){
    val scanner = Scanner(System.`in`)

    print("Please enter number of tickets: ")
    var numOfTickets = scanner.nextInt()

    print("How many round-trip tickets: ")
    var roundTickets = scanner.nextInt()

    val t = Ticket(numOfTickets,roundTickets)
    t.count()
}

// 類別

class Ticket(var NumOfTickets: Int,var RoundTickets: Int) {
    fun count() {
        println("Total tickets: $NumOfTickets")
        println("Round-trip $RoundTickets")
        println("Total: " + ((NumOfTickets-RoundTickets)*1000 + RoundTickets*1800))
    }
}