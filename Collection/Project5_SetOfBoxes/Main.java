package Collection.Project5_SetOfBoxes;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Box");
        int n = sc.nextInt();

        Set<Box> set = new HashSet<>();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the Box " + i + " details");

            System.out.println("Enter Length");
            double length = sc.nextDouble();

            System.out.println("Enter Width");
            double width = sc.nextDouble();

            System.out.println("Enter Height");
            double height = sc.nextDouble();

            set.add(new Box(length, width, height));
        }

        List<Box> list = new ArrayList<>(set);

        Collections.sort(list, new Comparator<Box>() {
            @Override
            public int compare(Box b1, Box b2) {
                return Double.compare(b1.getVolume(), b2.getVolume());
            }
        });

        System.out.println("Unique Boxes in the Set are");

        for (Box b : list) {
            System.out.printf(
                "Length =%.1f Width =%.1f Height =%.1f Volume =%.2f%n",
                b.getLength(),
                b.getWidth(),
                b.getHeight(),
                b.getVolume()
            );
        }

        sc.close();
    }
}