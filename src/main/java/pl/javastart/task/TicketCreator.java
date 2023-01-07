package pl.javastart.task;

import java.util.Scanner;

public class TicketCreator {
    private static Scanner sc = new Scanner(System.in);

    public static Ticket createTicket() {
        System.out.println("Wydarzenie:");
        String eventName = sc.nextLine();
        System.out.println("Miejsce: ");
        String eventAddress = sc.nextLine();
        System.out.println("Typ biletu ("
                + Ticket.ONLINE + ", "
                + Ticket.STANDARD + ", "
                + Ticket.GIFT + ")");
        String type = sc.nextLine();
        System.out.println("Podaj cenę:");
        double basicPrice = sc.nextDouble();
        System.out.println("Zniżka (0 - 1)");
        double discount = sc.nextDouble();
        sc.nextLine();
        return new Ticket(eventName, eventAddress, type, basicPrice, discount);
    }
}
