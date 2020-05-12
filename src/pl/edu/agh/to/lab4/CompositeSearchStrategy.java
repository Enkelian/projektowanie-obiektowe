package pl.edu.agh.to.lab4;

import java.util.ArrayList;
import java.util.List;

public class CompositeSearchStrategy implements SearchStrategy {

    List<SearchStrategy> searchStrategies = new ArrayList<>();

    public void addSearchStrategy(SearchStrategy searchStrategy){
        this.searchStrategies.add(searchStrategy);
    }

    @Override
    public boolean filter(Suspect suspect) {
        for(SearchStrategy searchStrategy : this.searchStrategies){
            if(!searchStrategy.filter(suspect)) return false;
        }
        return true;
    }
}
