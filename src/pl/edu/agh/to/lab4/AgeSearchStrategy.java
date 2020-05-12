package pl.edu.agh.to.lab4;

public class AgeSearchStrategy implements SearchStrategy {

    private int     age;

    public AgeSearchStrategy(int age) {
        this.age = age;
    }


    @Override
    public boolean filter(Suspect suspect) {
        if(suspect instanceof CracovCitizen){
            return ((CracovCitizen) suspect).getAge() == age;
        }
        return true;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
