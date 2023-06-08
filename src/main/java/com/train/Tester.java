package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number of tickets: ");
        int NumOfTickets = scanner.nextInt();

        System.out.print("How many round-trip tickets: ");
        int RoundTickets = scanner.nextInt();

        Ticket T = new Ticket(NumOfTickets,RoundTickets);
        T.Count();
    }
}
