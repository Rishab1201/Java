import java.util.*;
public class slip20a {
    public static void main(String[]args)
    {
        LinkedList<String>prolang=new LinkedList<>();

        prolang.add("cpp");
        prolang.add("java");
        prolang.add("python");

        System.out.println("contest of the list using itteration");
        Iterator<String> iterator=prolang.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("in reverse order:");
        ListIterator<String>listIterator=prolang.listIterator(prolang.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
