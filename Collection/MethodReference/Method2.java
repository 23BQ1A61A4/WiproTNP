package Collection.MethodReference;

public class Method2 {

    public static void main(String[] args){

        DigitCountInterface d=DigitCountClass::digitCount;

        System.out.println(d.digitCount(987654));

    }

}