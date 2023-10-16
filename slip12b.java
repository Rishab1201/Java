public class slip12b {
    public static void main(String[] args) {
        String[] stringArray = { "hello", "rehan" };
        System.out.println("Original array");
        displayAndReverseStringArray(stringArray);
    }

    private static void displayAndReverseStringArray(String[] array) {
        System.out.println("Original array:");
        for (String str : array) {
            System.out.println(str);
        }

        System.out.println("Reversed array:");
        for (String str : array) {
            StringBuilder reversed = new StringBuilder(str).reverse();
            System.out.println(reversed);
        }
    }
}
