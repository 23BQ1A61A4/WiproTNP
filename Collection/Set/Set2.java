package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Set2 {

    public static void main(String[] args){

        HashSet<String> set=new HashSet<>();

        set.add("Ram");
        set.add("Sita");
        set.add("Krishna");
        set.add("Ravi");

        Iterator<String> it=set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}