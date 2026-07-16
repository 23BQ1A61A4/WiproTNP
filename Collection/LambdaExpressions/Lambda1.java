package Collection.LambdaExpressions;

import java.util.ArrayList;

public class Lambda1 {

    static boolean isPrime(int n){

        if(n<2)
            return false;

        for(int i=2;i<=Math.sqrt(n);i++){

            if(n%i==0)
                return false;
        }

        return true;
    }

    public static void main(String[] args){

        ArrayList<Integer> a1=new ArrayList<>();

        a1.add(10);
        a1.add(3);
        a1.add(17);
        a1.add(22);
        a1.add(5);
        a1.add(18);
        a1.add(29);
        a1.add(7);
        a1.add(12);
        a1.add(13);
        a1.add(19);
        a1.add(20);
        a1.add(23);
        a1.add(31);
        a1.add(2);
        a1.add(8);
        a1.add(9);
        a1.add(41);
        a1.add(15);
        a1.add(27);
        a1.add(11);
        a1.add(37);
        a1.add(14);
        a1.add(43);
        a1.add(6);

        a1.forEach(n->{
            if(isPrime(n))
                System.out.println(n);
        });
    }
}