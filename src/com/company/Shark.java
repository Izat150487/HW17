package com.company;

public class Shark extends Animal {
    @Override
    public void animalMethod() {
        super.animalMethod();
    }
    public void attack(){
        System.out.println("Shark :" + " A shark can attack people!");
    }
}
