import java.util.*;
class slip3b
{
  static int n;
  public static void main(String args[])
  {
    System.out.println("Enter the number:");
    Scanner sc=new Scanner(System.in);
    slip3b.n=sc.nextInt();
    System.out.println("The entered number is:"+slip3b.n);
    int s=0,r=0,temp=slip3b.n;
    while(slip3b.n!=0)
    {
     r=slip3b.n%10;
     s=s+(r*r*r);
     slip3b.n=slip3b.n/10;
    } 
    System.out.println("The sum of each digite is:"+s);
    if(temp==s)
    {
     System.out.println("Is an armstrong number.");
    }
    else 
    {
      System.out.println("Not an Armstrong number.");
    }
  }
}
 
