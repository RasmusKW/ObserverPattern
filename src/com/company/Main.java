package com.company;

import java.util.Observer;

public class Main {

    public static void main(String[] args) {
    ParentObservable daddysDaycare = new ParentObservable();
	IObserver kid1 = new Kid1Observer();
	IObserver kid2 = new Kid2Observer();

	daddysDaycare.add(kid1);
	daddysDaycare.add(kid2);

	daddysDaycare.setAreWeThere(true);

    }
}
