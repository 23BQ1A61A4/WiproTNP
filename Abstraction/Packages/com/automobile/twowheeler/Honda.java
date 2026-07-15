package Abstraction.Packages.com.automobile.twowheeler;

import Abstraction.Packages.com.automobile.Vehicle;

public class Honda extends Vehicle {

    public String getModelName() {
        return "Honda Shine";
    }

    public String getRegistrationNumber() {
        return "TS09XY5678";
    }

    public String getOwnerName() {
        return "Buddy";
    }

    public int getSpeed() {
        return 80;
    }

    public void cdplayer() {
        System.out.println("CD Player On");
    }
}