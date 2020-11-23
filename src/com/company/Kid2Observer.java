package com.company;


public class Kid2Observer implements IObserver{

    @Override
    public void update(String msg) {
        handleMsg(msg);
    }

    public void handleMsg(String msg){
        System.out.println("Kid 2: Wuhuuu we are finally there!");
    }

}
