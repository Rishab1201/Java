//Slip 11 Question :- B

import java.util.*;

public class MenuPrg {
    public static void main(String arg[])
    {
        int r = 0;

        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println("Enter your choice:");

        Scanner sc = new Scanner(System.in);

        int ch = sc.nextInt();

        System.out.println("Enter a number : ");

        Scanner ab = new Scanner(System.in);

        int a = ab.nextInt();

        System.out.println("Enter 2nd number :");
        Scanner bc = new Scanner(System.in);

        int b = bc.nextInt();

        switch (ch)
        {
            case 1:
                r = a + b;
                break;

            case 2 :
                r = a - b;
                break;

            case 3:
                r = a * b;
                break;

            case 4:
                r = a / b;
                break;
        }

        System.out.println("Result : " + r);
    }
}
