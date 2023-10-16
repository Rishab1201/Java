import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class slip18a {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt"; // Replace with the actual source file path
        String targetFilePath = "target.txt"; // Replace with the actual target file path

        try {
            FileReader reader = new FileReader(sourceFilePath);
            FileWriter writer = new FileWriter(targetFilePath);

            int charValue;
            while ((charValue = reader.read()) != -1) {
                char character = (char) charValue;

                if (Character.isLetter(character)) {
                    if (Character.isUpperCase(character)) {
                        character = Character.toLowerCase(character);
                    } else {
                        character = Character.toUpperCase(character);
                    }
                } else if (Character.isDigit(character)) {
                    character = '*';
                }

                writer.write(character);
            }

            reader.close();
            writer.close();

            System.out.println("File copied and modified successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
