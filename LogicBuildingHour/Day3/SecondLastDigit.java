package LogicBuildingHour.Day3;

public class SecondLastDigit {
    public static int secondLastDigit(int num){
        return(num/10) % 10;
    }
    public static void main(String[] args){
        System.out.println(secondLastDigit(123));
        System.out.println(secondLastDigit(5678));
    }
    
}
