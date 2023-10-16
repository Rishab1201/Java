import java.util.Arrays;
import java.util.Scanner;
public class slip16a {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. of employees:");
        int n=sc.nextInt();

        String[] employee = new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter names of employees:");
            employee[i]=sc.next();
        }

        Arrays.sort(employee);

        System.out.println("Sorted employee namee:");
        for(String employees: employee){
            System.out.println(employees);
        }
    }
}
