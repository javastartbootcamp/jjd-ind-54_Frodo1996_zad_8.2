package pl.javastart.task;

public class TicketPriceCalc {
    private static final double STANDARD_TICKET = 5;
    private static final double GIFT_TICKET_ENLARGED = 0.05;

    static double priceCalculate(Ticket ticket) {
        return switch (ticket.getType()) {
            case Ticket.ONLINE -> onlinePrice(ticket);
            case Ticket.GIFT -> giftPrice(ticket);
            default -> standardPrice(ticket);
        };
    }

    private static double giftPrice(Ticket ticket) {
        double basicPrice = ticket.getBasicPrice();
        double giftPayment = GIFT_TICKET_ENLARGED * basicPrice;
        return standardPrice(ticket) + giftPayment;
    }

    private static double standardPrice(Ticket ticket) {
        return onlinePrice(ticket) + STANDARD_TICKET;
    }

    private static double onlinePrice(Ticket ticket) {
        double basicPrice = ticket.getBasicPrice();
        double discount = ticket.getDiscount();
        return basicPrice - (basicPrice * discount);
    }
}
