import java.util.Scanner;

public class arms {
    public static void main(String[]args)
    {
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        int n,r=0,sum=0,n2=0;
        n=n2;
        n=sc.nextInt();
        while(n>0)
        {
            n=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(n==n2)
        {
            System.out.println(sum+" is a armstrong number");
        }
        if(n!=n2){
            System.out.println("not an armstrong number");
        }
        else{
            System.out.println("enter a valid data");
        }
    }
}
