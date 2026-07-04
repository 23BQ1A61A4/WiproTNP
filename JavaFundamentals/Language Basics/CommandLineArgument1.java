public class CommandLineArgument1{
    public static void main(String[] args){
        if (args.length < 2) {
            System.out.println("Please provide two command line arguments");
            System.out.println("Example: java CommandLineArgument1 Java Wipro");
            return;
        }
        System.out.println(args[0] + " Technologies " + args[1]);
    }
}
