import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pract{
    public static void main(String[]args){
        String sourceFilePath="source.txt";
        String targetFilePath="target.txt";

        try{
            FileReader reader=new FileReader(sourceFilePath);
            FileWriter writer=new FileWriter(targetFilePath);

            int charValue;
            while((charValue=reader.read())!=-1){
            char character=(char) charValue;

            if(Character.isLetter(character)){
                if(Character.isUpperCase(character)){
                    character=Character.toLowerCase(character);
                }
                else{
                    character=Character.toUpperCase(character);
                }
                
            }
            else if(Character.isDigit(character)){
                character='*';
            }
            writer.write(character);
            }
            reader.close();
            writer.close();
            System.out.println("file copied and modified");

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}