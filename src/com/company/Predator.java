package com.company;

public abstract class Predator extends Animal {
    public void eat(Eatable a) {
        if (a.isEatable()) {
            System.out.println(this.toString() + " съел " + a.toString());
        }


    }


}
