package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ticket ticket1 = TicketCreator.createTicket();
        Ticket ticket2 = TicketCreator.createTicket();
        Ticket ticket3 = TicketCreator.createTicket();
        double ticketPrice1 = TicketPriceCalc.priceCalculate(ticket1);
        System.out.println(ticket1.getInfo() + ", cena biletu: " + ticketPrice1);
        double ticketPrice2 = TicketPriceCalc.priceCalculate(ticket2);
        System.out.println(ticket2.getInfo() + ", cena biletu: " + ticketPrice2);
        double ticketPrice3 = TicketPriceCalc.priceCalculate(ticket3);
    }
}
