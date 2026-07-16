package Collection.Map;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Map5 {

    TreeMap<String,String> M1=new TreeMap<>();

    TreeMap<String,String> saveCountryCapital(String country,String capital){
        M1.put(country,capital);
        return M1;
    }

    String getCapital(String country){
        return M1.get(country);
    }

    String getCountry(String capital){

        for(Map.Entry<String,String> e:M1.entrySet()){

            if(e.getValue().equals(capital))
                return e.getKey();
        }

        return null;
    }

    TreeMap<String,String> swapKeyValue(){

        TreeMap<String,String> M2=new TreeMap<>();

        for(Map.Entry<String,String> e:M1.entrySet()){
            M2.put(e.getValue(),e.getKey());
        }

        return M2;
    }

    ArrayList<String> toArrayList(){

        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args){

        Map5 obj=new Map5();

        obj.saveCountryCapital("India","Delhi");
        obj.saveCountryCapital("Japan","Tokyo");

        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
        System.out.println(obj.swapKeyValue());
        System.out.println(obj.toArrayList());
    }
}