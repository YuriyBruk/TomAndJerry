package com.company;

public abstract class Animal implements IAnimal {
    protected  String name;
    @Override
    public String getName(){
        return name;
    }

    @Override
    public void run() {

    }

    @Override
    public void move() {

    }
    @Override
    public String toString(){
        return  name;
    }
}


