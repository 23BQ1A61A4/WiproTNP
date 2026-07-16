package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map4 {

    public static void main(String[] args){

        HashMap<String,Integer> contactList=new HashMap<>();

        contactList.put("Ram",1111);
        contactList.put("Sita",2222);
        contactList.put("Ravi",3333);

        System.out.println(contactList.containsKey("Ram"));
        System.out.println(contactList.containsValue(3333));

        Iterator<Map.Entry<String,Integer>> it=contactList.entrySet().iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}