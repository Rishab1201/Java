import java.util.Scanner;

class swap{
    public static void main(String []args)
    {
        int a,b,c=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value of a:");
        a= scanner.nextInt();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter value of b:");
        b= scan.nextInt();
        System.out.println("a=10 & b=20");
        c=a;
        a=b;
        b=c;
        System.out.println("swapped value");
        System.out.println("value of a="+a);
        System.out.println("value of b="+b);
    }
}