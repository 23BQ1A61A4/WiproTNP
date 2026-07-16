package Collection.List;

import java.util.ArrayList;

public class List4 {

    public static void main(String[] args){

        ArrayList<Number> list=new ArrayList<>();

        list.add(10);
        list.add(20.5);
        list.add(30f);
        list.add(40L);

        System.out.println(list);
    }
}