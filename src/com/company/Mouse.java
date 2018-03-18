package com.company;

public class Mouse extends Animal {
    public  Mouse(String name){
        this.name=name;
    }


    @Override
    public boolean isEatable() {
        return true;
    }
}
