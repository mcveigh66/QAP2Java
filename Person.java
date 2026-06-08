public class Person {
    private final String lastName;
    private final String firstName;
    private final Address home;

    // Constructor 
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // Formats the persons info 
    @Override
    public String toString() {
        return lastName + " " + firstName + ", " + home.toString();
    }
}

