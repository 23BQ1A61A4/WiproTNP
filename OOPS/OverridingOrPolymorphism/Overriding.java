package OOPS.OverridingOrPolymorphism;

class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Apple extends Fruit {

    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Apple tastes sweet");
    }
}

class Orange extends Fruit {

    Orange() {
        super("Orange", "Sweet and Sour", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Orange tastes sweet and sour");
    }
}

public class Overriding {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();

        apple.eat();
        orange.eat();
    }
}