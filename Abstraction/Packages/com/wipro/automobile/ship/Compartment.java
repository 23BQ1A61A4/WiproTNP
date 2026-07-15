package Abstraction.Packages.com.wipro.automobile.ship;

public class Compartment {

    int height;
    int width;
    int breadth;

    public Compartment(int h,int w,int b){
        height=h;
        width=w;
        breadth=b;
    }

    public void display(){
        System.out.println("Height : "+height);
        System.out.println("Width : "+width);
        System.out.println("Breadth : "+breadth);
    }
}