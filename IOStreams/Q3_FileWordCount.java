package IOStreams;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q3_FileWordCount {

    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            System.out.println("Usage: java IOStreams.Q3_FileWordCount inputFile outputFile");
            return;
        }

        File inputFile = new File(args[0]);

        Scanner sc = new Scanner(inputFile);

        TreeMap<String, Integer> map = new TreeMap<>();

        while (sc.hasNext()) {

            String word = sc.next();

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }

        }

        sc.close();

        FileWriter fw = new FileWriter(args[1]);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            fw.write(entry.getKey() + " : " + entry.getValue());

            fw.write(System.lineSeparator());

        }

        fw.close();

        System.out.println("Word count written to " + args[1]);

    }

}