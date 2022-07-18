package com.company;

import static java.lang.System.*;

public class Eagle extends Animal{

    @Override
    public void animalMethod() {
        super.animalMethod();
    }
    public void fly() {
        out.println("Eagle: " + "An eagle can fly in the sky");
    }
}
