package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map2 {

    public static void main(String[] args){

        HashMap<String,String> map=new HashMap<>();

        map.put("A","Apple");
        map.put("B","Ball");
        map.put("C","Cat");

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue("Cat"));

        Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}