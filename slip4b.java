import java.util.Scanner;
public class slip4b {
    public static void main(String []args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a string");
        String s=scanner.nextLine();
        for(int i=0;i<s.length();i=i+2)
        {
            System.out.println(s.charAt(i));
        }
        
    }
}
