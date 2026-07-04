package JavaFundamentals.Arrays;
import java.util.Arrays;

class OneDArray5 {
    public static void main(String args[]) {

        int arr[]={12,45,3,89,23,5};

        Arrays.sort(arr);

        System.out.println("Smallest: " + arr[0] + " " + arr[1]);

        System.out.println("Largest: " +
                arr[arr.length-2] + " " +
                arr[arr.length-1]);
    }
}