package Abstraction.Packages.com.automobile.fourwheeler;

public class TestFourWheeler {

    public static void main(String[] args) {

        Logan l=new Logan();

        System.out.println(l.getModelName());
        System.out.println(l.speed());
        l.gps();

        Ford f=new Ford();

        System.out.println(f.getModelName());
        System.out.println(f.speed());
        System.out.println(f.tempControl());

    }
}