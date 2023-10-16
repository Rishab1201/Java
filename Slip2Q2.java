import java.util.*;

public class Slip2Q2 {
    public static void main(String arg[])
    {
        if(arg.length == 0)
        {
            System.out.println("Enter a string:");

            Scanner sc = new Scanner(System.in);

            String s = sc.next();

            for(int i = 0; i < s.length(); i++)
            {
                char ch = s.charAt(i);
                if((ch == 'A' || ch == 'a') || (ch == 'E' || ch == 'e') || (ch == 'I' || ch == 'i')
                || (ch == 'O' || ch == 'o') || (ch == 'U' || ch == 'u')){
                    System.out.println(" " + ch);
                }
            }
        }
        else {
            System.out.println("Please enter string..");
        }

    }
}
