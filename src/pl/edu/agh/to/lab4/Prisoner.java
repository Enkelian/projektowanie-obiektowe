package pl.edu.agh.to.lab4;

import java.util.Calendar;

public class Prisoner {
    private final int judgementYear;

    private final int senteceDuration;

    private final String pesel;

    private final String name;

    private final String surname;

    public Prisoner(String name, String surname, String pesel, int judgementYear, int sentenceDuration) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.judgementYear = judgementYear;
        this.senteceDuration = sentenceDuration;
    }

    public String getPesel() {
        return pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isJailedNow() {
        return judgementYear + senteceDuration >= getCurrentYear();
    }

    public String display() {return name+" "+surname;}

    private int getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}
