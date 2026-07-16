package Collection.Set;

import java.util.HashSet;

public class Set1 {

    HashSet<String> H1=new HashSet<>();

    HashSet<String> saveCountryNames(String countryName){

        H1.add(countryName);
        return H1;
    }

    String getCountry(String countryName){

        for(String s:H1){

            if(s.equals(countryName))
                return s;
        }

        return null;
    }

    public static void main(String[] args){

        Set1 obj=new Set1();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("China"));
    }
}