package Collection.MethodReference;

public class Method1 {

    public static void main(String[] args){

        FactorialClass obj=new FactorialClass();

        FactorialInterface f=obj::factorial;

        System.out.println(f.factorial(5));
    }

}