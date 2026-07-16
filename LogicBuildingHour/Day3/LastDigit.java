package LogicBuildingHour.Day3;

public class LastDigit {
    public static int lastDigit(int num) {
        return num % 10;
    }
    public static void main(String[] args) {
        System.out.println(lastDigit(123));
        System.out.println(lastDigit(5678));
    }
    
}
