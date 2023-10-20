//Mahsa Askari
//Matrikulation Nummer 7216484
//Java course exam task 1
import java.util.ArrayList;
import java.util.List;

class Address {
    private String country;
    private String city;
    private int index;
    private String street;
    private String house;
    private String flat;

    public Address() {}

    public Address(String country, String city, int index, String street, String house, String flat) {
        this.country = country;
        this.city = city;
        this.index = index;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    // Setters and getters
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHouse() {
        return house;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getFlat() {
        return flat;
    }
}

class Date {
    private int date;
    private int month;
    private int year;

    public Date() {}

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    // Setters and getters
    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

class Parcel {
    private int id;
    private Date departureDate;
    private Date arrivalDate;
    private Address departureAddress;
    private Address arrivalAddress;

    public Parcel() {}

    public Parcel(int id, Date departureDate, Date arrivalDate, Address departureAddress, Address arrivalAddress) {
        this.id = id;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureAddress = departureAddress;
        this.arrivalAddress = arrivalAddress;
    }

    // Setters and getters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setDepartureAddress(Address departureAddress) {
        this.departureAddress = departureAddress;
    }

    public Address getDepartureAddress() {
        return departureAddress;
    }

    public void setArrivalAddress(Address arrivalAddress) {
        this.arrivalAddress = arrivalAddress;
    }

    public Address getArrivalAddress() {
        return arrivalAddress;
    }
}

public class Delivery {
    public static void main(String[] args) {
        List<Parcel> parcels = new ArrayList<>();

        // Creating parcels and adding them to the list
        Address departureAddress1 = new Address("Germany", "Dresden", 12345, "Muller", "12A", "10");
        Address arrivalAddress1 = new Address("UK", "London", 67890, "Oxford Street", "34B", "5");
        Parcel parcel1 = new Parcel(1, new Date(10, 10, 2023), new Date(15, 10, 2023), departureAddress1, arrivalAddress1);
        parcels.add(parcel1);

        Address departureAddress2 = new Address("Germany", "Berlin", 11111, "Friedrichstrasse", "56C", "8");
        Address arrivalAddress2 = new Address("France", "Paris", 22222, "Champs-Élysées", "78D", "3");
        Parcel parcel2 = new Parcel(2, new Date(12, 10, 2023), new Date(18, 10, 2023), departureAddress2, arrivalAddress2);
        parcels.add(parcel2);

        // Printing all addresses where parcels should be delivered
        for (Parcel parcel : parcels) {
            System.out.println("Delivery Address: " + parcel.getArrivalAddress().getCountry() + ", "
                    + parcel.getArrivalAddress().getCity() + ", "
                    + parcel.getArrivalAddress().getIndex() + ", "
                    + parcel.getArrivalAddress().getStreet() + ", "
                    + parcel.getArrivalAddress().getHouse() + ", "
                    + parcel.getArrivalAddress().getFlat());
        }
    }
}
