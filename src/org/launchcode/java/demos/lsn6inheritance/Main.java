package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.noise() + " " + garfield.purr() + ".");

        Cat suki = new HouseCat("suki", 8);
        ((HouseCat) suki).isSatisfied();
    }
}
