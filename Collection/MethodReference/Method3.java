package Collection.MethodReference;

public class Method3 {

    public static void main(String[] args){

        PrimeInterface p=PrimeClass::new;

        p.check(17);
        p.check(20);

    }

}