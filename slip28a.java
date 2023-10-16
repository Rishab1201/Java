import java.util.Scanner;

public class slip28a{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a list of integers as command line arguments.");
            return;
        }

        int count = 0;

        for (String arg : args) {
            try {
               
               int  num = Integer.parseInt(arg);
                count++;
            } catch (NumberFormatException e) {
                // Ignore non-integer arguments
            }
        }

        System.out.println("Number of integers in the list: " + count);
    }
}
