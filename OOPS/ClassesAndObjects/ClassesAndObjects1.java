package OOPS.ClassesAndObjects;

class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double getVolume() {
        return width * height * depth;
    }
}

public class ClassesAndObjects1 {
    public static void main(String[] args) {
        Box box = new Box(10, 5, 2);

        System.out.println("Volume of Box: " + box.getVolume());
    }
}