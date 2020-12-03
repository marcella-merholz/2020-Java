package at.dcv.DigitalCampus;

public class Person {

    private String firstName;
    private String lastName;
    private String street;
    private String streetNumber;
    private int postalCode;
    private String city;
    private String country;

    public Person(String firstName, String lastName, String street, String streetNumber, int postalCode, String city, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public static void saveAddress(String filename) {
        // in csv speichern
    }

}
