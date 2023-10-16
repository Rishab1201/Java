import java.util.Scanner;
public class slip16b{
public static void main(String[]args)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a number:");
    int num=sc.nextInt();

    int sum=calculateSumOfDigit(num);
    System.out.println("sum of diigit is:"+sum);
}
public static int calculateSumOfDigit(int num)
{
    if(num==0)
    {
        return 0;
    }
    else{
        return num%10+calculateSumOfDigit(num/10);
    }
}

}