import java.util.*;
import java.util.Scanner;
class slip13a{
    public static void main(String[]args)
    {
        System.out.println("enter name:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toUpperCase();
        System.out.println("hello " + s + " nice to meet you..!");
    }
}