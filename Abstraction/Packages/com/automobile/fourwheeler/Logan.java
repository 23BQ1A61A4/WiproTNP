package Abstraction.Packages.com.automobile.fourwheeler;

import Abstraction.Packages.com.automobile.Vehicle;

public class Logan extends Vehicle {

    public String getModelName() {
        return "Logan";
    }

    public String getRegistrationNumber() {
        return "AP01AA1111";
    }

    public String getOwnerName() {
        return "Rahul";
    }

    public int speed() {
        return 120;
    }

    public void gps() {
        System.out.println("GPS Started");
    }
}