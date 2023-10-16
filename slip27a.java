import java.util.Scanner;

class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

public class slip27a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            checkRange(number);
            displayFactors(number);
        } catch (NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkRange(int number) throws NumberOutOfRangeException {
        if (number > 1000) {
            throw new NumberOutOfRangeException("Number is out of Range");
        }
    }

    static void displayFactors(int number) {
        System.out.println("Factors of " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
