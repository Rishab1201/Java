import java.util.Scanner;
public class Slip2b {
    public static void main(String []args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter string:");
        String input=scanner.nextLine();
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println("vowel:"+ch);
            }
            else
            {
                System.out.println("constant");
            }
        }
    }
}
