package IOStreams;

import java.io.File;
import java.util.Scanner;

public class Q1_CharacterCount {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name");
        String fileName = sc.nextLine();

        System.out.println("Enter the character to be counted");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        File file = new File(fileName);

        Scanner fs = new Scanner(file);

        int count = 0;

        while (fs.hasNextLine()) {

            String line = fs.nextLine().toLowerCase();

            for (int i = 0; i < line.length(); i++) {

                if (line.charAt(i) == ch) {
                    count++;
                }

            }

        }

        fs.close();
        sc.close();

        System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + ch + "'.");

    }

}