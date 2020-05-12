package pl.edu.agh.to.lab4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class FlatIterator implements Iterator<Suspect> {

    private Iterator<Collection<Prisoner>> collectionIterator;
    private Iterator<? extends Suspect> suspectIterator;


    public FlatIterator(Map<String, Collection<Prisoner>> map){

        this.collectionIterator = map.values().iterator();

        this.suspectIterator = this.collectionIterator.next().iterator();

    }


    @Override
    public boolean hasNext() {
        return this.suspectIterator.hasNext() || this.collectionIterator.hasNext();
    }

    @Override
    public Suspect next() {

        if (!this.suspectIterator.hasNext()) {
            this.suspectIterator = this.collectionIterator.next().iterator();
        }

        return this.suspectIterator.next();

    }
}
