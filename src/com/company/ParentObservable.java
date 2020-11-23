package com.company;

import java.util.ArrayList;
import java.util.List;

public class ParentObservable implements IObservable{
    private List<IObserver> kids = new ArrayList<>();
    private boolean areWeThere = false;

    @Override
    public void add(IObserver observer) {
        kids.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        kids.remove(observer);
    }

    @Override
    public void notifyObservers() {

        if(areWeThere) {
            System.out.println("Dad: We are there!");
            for (IObserver observer : kids) {
                observer.update("There!");
            }
        }

    }

    public void setAreWeThere(boolean areWeThere) {
        this.areWeThere = areWeThere;
        notifyObservers();
    }
}
