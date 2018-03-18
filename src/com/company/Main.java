package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Predator spyke=new Dog("Spyke");
        Predator tom = new Cat("Tom");
        IAnimal jerry= new Mouse("Jerry");
        spyke.eat(jerry);
        spyke.eat(tom);
        tom.eat(jerry);

    }
}

