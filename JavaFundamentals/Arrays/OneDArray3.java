package JavaFundamentals.Arrays;
class OneDArray3 {
    public static void main(String args[]) {

        if(args.length==0){
            System.out.println("Please enter a number");
            return;
        }

        int arr[]={1,4,34,56,7};
        int key=Integer.parseInt(args[0]);

        int index=-1;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==key){
                index=i;
                break;
            }

        }

        System.out.println(index);
    }
}