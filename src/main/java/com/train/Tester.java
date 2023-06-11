package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            while(true){
                System.out.print("Please enter number of tickets: ");
                int NumOfTickets = scanner.nextInt();

                if (NumOfTickets != -1) {
                    System.out.print("How many round-trip tickets: ");
                    int RoundTickets = scanner.nextInt();

                    Ticket T = new Ticket(NumOfTickets, RoundTickets);
                    T.Count();
                } else {
                    break;
                }
            }


        }
    }
