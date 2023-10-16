import java.util.Scanner;

class NumberIsZeroException extends Exception {
    public NumberIsZeroException() {
        super("Number is Zero");
    }
}

class NumberIsInvalidException extends Exception {
    public NumberIsInvalidException() {
        super("Number is Invalid");  
    }
}

public class slip30b{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            if (input.isEmpty() ) {
                throw new NumberIsInvalidException();
            }
            int number = Integer.parseInt(input);
            if (number == 0) {
                throw new NumberIsZeroException();
            }
            if (isPalindrome(input)) {
                System.out.println("The number is a palindrome.");
            } else {
                System.out.println("The number is not a palindrome.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberIsZeroException | NumberIsInvalidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static boolean isPalindrome(String str) {
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
