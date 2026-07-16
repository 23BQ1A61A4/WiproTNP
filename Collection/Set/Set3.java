package Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Set3 {

    public static void main(String[] args){

        TreeSet<String> set=new TreeSet<>();

        set.add("India");
        set.add("USA");
        set.add("Japan");
        set.add("Australia");

        System.out.println(set.descendingSet());

        Iterator<String> it=set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(set.contains("India"));
    }
}