import java.util.ArrayList;
import java.util.Scanner;

public class slip13b{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numberList.add(num);
        }

        System.out.println("Elements in reverse order:");
        for (int i = numberList.size() - 1; i >= 0; i--) {
            System.out.println(numberList.get(i));
        }

        scanner.close();
    }
}
 