package Abstraction.Packages.com.automobile.twowheeler;

import Abstraction.Packages.com.automobile.Vehicle;

public class Hero extends Vehicle {

    public String getModelName() {
        return "Hero Splendor";
    }

    public String getRegistrationNumber() {
        return "AP39AB1234";
    }

    public String getOwnerName() {
        return "Ishu";
    }

    public int getSpeed() {
        return 70;
    }

    public void radio() {
        System.out.println("Radio On");
    }
}