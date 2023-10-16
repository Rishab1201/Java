import java.util.Scanner;

public class slip12a {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        for(int i=0;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
