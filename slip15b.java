import java.util.Scanner;
public class slip15b{
    public static void main(String[]args)
    {
        String[]names={"rehan","priyanka","rishab","yash"};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nuame to search:");
        String searchName=sc.nextLine();
        int index=-1;
        for(int i=0;i<names.length;i++)
        {
            if(names[i].equalsIgnoreCase(searchName)){
                index=i;
                break;
            }
        }

        if(index!=-1){
            System.out.println("name found at index no:"+index);
        }
        else {
            System.out.println("Name not found in the array.");
        }
    }
}