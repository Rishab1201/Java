import java.util.Scanner;
class product{
    int pid;
    double price;
    int qty;

    product(int pid,double price,int qty){
        this.pid=pid;
        this.price=price;
        this.qty=qty;
    }

    double total()
    {
        return price*qty;
    }

    void display()
        {
        System.out.println("Product ID: " + pid);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
        }
}

public class slip17a{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
         System.out.print("Enter the number of products: ");
         int n=sc.nextInt();

         product[] pro=new product[n];
         for(int i=0;i<n;i++)
         {
            System.out.println("enter details:");
            System.out.println("product ID:");
            int pid=sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            pro[i]= new product(pid,price,qty);
         }

         double amt=0;
         for(product xyz: pro)
         {
            xyz.display();
            System.out.println("toal amount:"+xyz.total());
            amt+=xyz.total();
         }

         System.out.println("total  amount of all products:"+amt);
    }
}
