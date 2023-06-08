package com.train;

public class Ticket {
    // 屬性
    int NumOfTickets;
    int RoundTickets;

    // 建構子
    public Ticket(int NumOfTickets, int RoundTicket) {
        this.NumOfTickets = NumOfTickets;
        this.RoundTickets = RoundTicket;
    }

    // 方法
    public void Count() {
        System.out.println("Total tickets: " + NumOfTickets);
        System.out.println("Round-trip " + RoundTickets);
        System.out.println("Total: " + ((NumOfTickets-RoundTickets)*1000 + RoundTickets*1800));
    }
}

