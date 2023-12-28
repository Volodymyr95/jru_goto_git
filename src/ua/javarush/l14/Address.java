package ua.javarush.l14;

public class Address {

    private String country;
    private String city;
    private String street;

    public Address() {
    }

    public Address(String country, String city, String street) {
        this(); // Address();
        this.getCity(); // Address().getCity();
        this.country = country;   //this.country ==> Address.contry    || country ==> country
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }
}
