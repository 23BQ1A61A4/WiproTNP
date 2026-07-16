package Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Map1 {

    HashMap<String,String> M1=new HashMap<>();

    HashMap<String,String> saveCountryCapital(String country,String capital){
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

    HashMap<String,String> swapKyeValue(){

        HashMap<String,String> M2=new HashMap<>();

        for(Map.Entry<String,String> e:M1.entrySet()){
            M2.put(e.getValue(),e.getKey());
        }

        return M2;
    }

    ArrayList<String> toArrayList(){

        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args){

        Map1 obj=new Map1();

        obj.saveCountryCapital("India","Delhi");
        obj.saveCountryCapital("Japan","Tokyo");
        obj.saveCountryCapital("USA","Washington");

        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
        System.out.println(obj.swapKyeValue());
        System.out.println(obj.toArrayList());
    }
}