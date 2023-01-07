package pl.javastart.task;

public class Ticket {
    public static final String ONLINE = "online";
    public static final String STANDARD = "standard";
    public static final String GIFT = "gift";

    private String eventName;
    private String eventAddress;
    private String type;
    private double basicPrice;
    private double discount;
    private int count;

    private static int counter = 1;

    public Ticket(String eventName, String eventAddress, String type, double basicPrice, double discount) {
        count = counter;
        counter++;
        this.eventName = eventName;
        this.eventAddress = eventAddress;
        this.type = type;
        this.basicPrice = basicPrice;
        this.discount = discount;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventAddress() {
        return eventAddress;
    }

    public void setEventAddress(String eventAddress) {
        this.eventAddress = eventAddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    String getInfo() {
        return "Bilet nr: " + count + ", " + eventName + ", " + eventAddress +
                ", cena: " + basicPrice + "zł, zniżka: " + (discount * 100) + "%, typ biletu: " + typeInfo();
    }

    private String typeInfo() {
        return switch (type) {
            case ONLINE -> "bilet internetowy";
            case GIFT -> "bilet prezentowy";
            default -> "bilet standardowy";
        };
    }
}
