import java.util.Scanner;
class NumberIsException extends Exception{
    public NumberIsException (String message)
    {
        super(message);
    }
}
public class slip6b {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter anumber:");
        int num=scanner.nextInt();
        try{
            if(num==0)
            {
                throw new NumberIsException("number is zero");
            }
            else{
                int sum=calculateSum(num);
                System.out.println("sum of first and last digit="+sum);
            }
        }catch(NumberIsException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static int calculateSum(int num)
    {
        int lastdigit=num%10;
        while(num>=10)
        {
            num/=10;
        }
        int firstdigit=num;
        return firstdigit+lastdigit;
    }
}
