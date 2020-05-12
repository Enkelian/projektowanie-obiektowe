package pl.edu.agh.to.lab4;

import java.util.*;

public class CompositeAggregate implements SuspectAggregate {

    private List<SuspectAggregate> suspectAggregates;

    public CompositeAggregate(){
        this.suspectAggregates = new ArrayList<>();
    }

    void addAggregate(SuspectAggregate aggregate){
        this.suspectAggregates.add(aggregate);
    }


    @Override
    public Iterator<? extends Suspect> getIterator() {
        return new AggregatesIterator(this.suspectAggregates);
    }

}
