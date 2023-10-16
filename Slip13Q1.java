import java.util.*;

class Slip13Q1
{
    public static void main(String arg[])
    {
        System.out.println("Enter your name: ");

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        s = s.toUpperCase();

        System.out.println("Hello, " + s + " Nice to meet you");
    }
}