package pl.edu.agh.to.lab4;

import java.util.Iterator;
import java.util.List;

public class AggregatesIterator implements Iterator {

    private Iterator<SuspectAggregate> compositeIterator;
    private Iterator<? extends Suspect> suspectIterator;

    public AggregatesIterator(List<SuspectAggregate> aggregates){
        this.compositeIterator = aggregates.iterator();
        this.suspectIterator = this.compositeIterator.next().getIterator();
    }

    @Override
    public boolean hasNext() {
        return this.suspectIterator.hasNext() && this.compositeIterator.hasNext();
    }

    @Override
    public Object next() {
        if(!this.suspectIterator.hasNext()){
            this.suspectIterator = this.compositeIterator.next().getIterator();
        }
        return this.suspectIterator.next();
    }
}
