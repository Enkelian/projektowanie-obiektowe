package pl.edu.agh.to.lab4;

public abstract class Suspect {
    private final String firstname;
    private final String lastname;
    protected int age;

    public Suspect(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Suspect(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = 0;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String display() {
        return firstname + " " + lastname;
    }

    public abstract boolean canBeAccused();

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }


}
