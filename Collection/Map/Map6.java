package Collection.Map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Map6 {

    Hashtable<String,String> M1=new Hashtable<>();

    Hashtable<String,String> saveCountryCapital(String country,String capital){
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

    Hashtable<String,String> swapKeyValue(){

        Hashtable<String,String> M2=new Hashtable<>();

        for(Map.Entry<String,String> e:M1.entrySet()){
            M2.put(e.getValue(),e.getKey());
        }

        return M2;
    }

    ArrayList<String> toArrayList(){

        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args){

        Map6 obj=new Map6();

        obj.saveCountryCapital("India","Delhi");
        obj.saveCountryCapital("Japan","Tokyo");

        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
        System.out.println(obj.swapKeyValue());
        System.out.println(obj.toArrayList());
    }
}