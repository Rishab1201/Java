import java.util.*;

class Slip4Q2
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for(int i = 0;i<s.length(); i = i + 2)
        {
            System.out.println(" " + s.charAt(i));
        }
        
    }
}