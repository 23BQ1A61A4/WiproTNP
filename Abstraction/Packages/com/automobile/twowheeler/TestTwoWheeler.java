package Abstraction.Packages.com.automobile.twowheeler;

public class TestTwoWheeler {

    public static void main(String[] args) {

        Hero h=new Hero();

        System.out.println(h.getModelName());
        System.out.println(h.getRegistrationNumber());
        System.out.println(h.getOwnerName());
        System.out.println(h.getSpeed());
        h.radio();

        Honda h1=new Honda();

        System.out.println(h1.getModelName());
        System.out.println(h1.getRegistrationNumber());
        System.out.println(h1.getOwnerName());
        System.out.println(h1.getSpeed());
        h1.cdplayer();

    }
}