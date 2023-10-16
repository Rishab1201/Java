import java.io.File;
import java.util.Arrays;

public class slip8a {
    public static void main(String[] args) {
        File directory = new File("C:/Users/sayye/OneDrive/Desktop/java");
        if (directory.isDirectory()) {
            Arrays.stream(directory.listFiles(f -> f.isFile() && f.getName().toLowerCase().endsWith(".txt")))
                  .map(File::getName)
                  .forEach(System.out::println);
        } else {
            System.out.println("Directory not found");
        }
    }
}
