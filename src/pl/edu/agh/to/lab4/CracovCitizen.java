package pl.edu.agh.to.lab4;

public class CracovCitizen {
    private final String firstname;

    private final String lastname;

    private int age;

    public CracovCitizen(String firstname, String lastname, int age) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String display() {
        return firstname + " " + lastname;
    }
}
