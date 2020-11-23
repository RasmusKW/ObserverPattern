package com.company;

public class Kid1Observer implements IObserver{

    @Override
    public void update(String msg) {
        handleMsg(msg);
    }

    public void handleMsg(String msg){
        System.out.println("Kid 1: We are REALLY there!");
    }

}
