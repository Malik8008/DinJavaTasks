package oop.CreateEmployeeAndAdrressClass;

public class Address {
    String street;
    String city;
    String zipCode;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + " (" + zipCode + ")";
    }
}
