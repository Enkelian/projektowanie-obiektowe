package pl.edu.agh.to.lab4;

import java.util.*;

public class Finder {

    private CompositeAggregate compositeAggregate = new CompositeAggregate();


    public Finder(PersonDataProvider personDataProvider, PrisonersDatabase prisonersDatabase) {
        this.compositeAggregate.addAggregate(personDataProvider);
        this.compositeAggregate.addAggregate(prisonersDatabase);
    }

    public void displayAllSuspectsWithName(String name) {

        List<Suspect> suspects = new ArrayList<Suspect>();

        CompositeSearchStrategy compositeSearchStrategy = new CompositeSearchStrategy();
        compositeSearchStrategy.addSearchStrategy(new NameSearchStrategy(name));
        compositeSearchStrategy.addSearchStrategy(new AgeSearchStrategy(18));

        for(Iterator<? extends Suspect> it = this.compositeAggregate.getIterator(); it.hasNext();){
            Suspect suspect = it.next();
            if(suspect.canBeAccused() && compositeSearchStrategy.filter(suspect)){
                suspects.add(suspect);
            }

        }

        int t = suspects.size();
        System.out.println("Znalazlem " + t + " pasujacych podejrzanych!");

        for (Suspect n : suspects) {
            System.out.println(n.display());
        }
    }
}
