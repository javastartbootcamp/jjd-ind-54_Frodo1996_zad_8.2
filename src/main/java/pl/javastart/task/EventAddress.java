package pl.javastart.task;

public class EventAddress {
    private String city;
    private String place;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    String getInfo() {
        return city + ", " + place;
    }
}
