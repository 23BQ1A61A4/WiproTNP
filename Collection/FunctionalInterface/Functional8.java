package Collection.FunctionalInterface;

import java.util.function.Supplier;

public class Functional8 {

    static boolean isPrime(int n){

        if(n < 2)
            return false;

        for(int i = 2; i <= Math.sqrt(n); i++){

            if(n % i == 0)
                return false;

        }

        return true;

    }

    public static void main(String[] args) {

        Supplier<Integer> s = () -> {

            while(true){

                int n = (int)(Math.random() * 100) + 1;

                if(isPrime(n))
                    return n;

            }

        };

        System.out.println(s.get());

    }

}