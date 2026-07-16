package LogicBuildingHour.Day3;

public class AddLastDigits {
    public static int addLastDigits(int num1, int num2){
        return(num1 % 10) + (num2 % 10);
    }
    public static void main(String[] args){
        System.out.println(addLastDigits(123, 456));
        System.out.println(addLastDigits(98, 75));
    }
    
}
