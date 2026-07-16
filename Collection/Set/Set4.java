package Collection.Set;

import java.util.TreeSet;

public class Set4 {

    TreeSet<String> H1=new TreeSet<>();

    TreeSet<String> saveCountryNames(String countryName){

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

        Set4 obj=new Set4();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("China"));
    }
}