
public class slip11b {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("\n1: Addition");
            System.out.println("\n2: Substraction");
            System.out.println("\n3: Multiplication");
            System.out.println("\n4: Division");
            return;
        }
        int ch = Integer.parseInt(args[0]);
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        int x = 0;
        switch (ch) {
            case 1:
                x = a + b;
                break;

            case 2:
                x = a - b;
                break;

            case 3:
                x = a * b;
                break;

            case 4:
                x = a / b;
                break;

        }
        System.out.println("\nResult:" + x);
    }
}