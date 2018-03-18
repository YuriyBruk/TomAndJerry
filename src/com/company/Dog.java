package com.company;

public class Dog extends   Predator {
    public Dog(String name){
        this.name=name;

    }



    @Override
    public boolean isEatable() {
        return false;
    }
}
