package com.company;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {new Eagle(), new Turtle(), new Shark()};

        for (Animal a:animals) {

            if (a instanceof Eagle || a.getClass().getName().equals("company.Eagle")) {

                ((Eagle) a).fly();

            } else if (a instanceof Turtle || a.getClass().getName().equals("company.Turtle")) {

                ((Turtle) a).swim();

            } else if (a instanceof Shark || a.getClass().getName().equals("company.Shark")) {

                ((Shark) a).attack();
            }
        }
    }
}
