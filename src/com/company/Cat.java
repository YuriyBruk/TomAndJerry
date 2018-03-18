package com.company;

public class Cat extends  Predator{
    public  Cat(String name){
        this.name=name;
    }
    @Override
    public boolean isEatable() {
        return true;
    }




}
