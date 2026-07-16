package Collection.LambdaExpressions;

public class MyClassWithLambda {

    public static void main(String[] args){

        WordCount obj=str->{

            if(str.trim().isEmpty())
                return 0;

            return str.trim().split("\\s+").length;

        };

        System.out.println(obj.count("Welcome to Wipro TalentNext Program"));
    }
}