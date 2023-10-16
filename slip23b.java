import java.io.File;
public class slip23b {
    public static void main(String []args)
    {
        String filename="target.txt";
        File file= new File(filename);

        if(file.exists()){
            if(file.isHidden()){
                System.out.println("the file is hidden:"+filename);
            }
            else{
                System.out.println("file path:"+file.getAbsolutePath());
            }

        }else{
            System.out.println("file doesnt exsist"+filename);
        }
    }
}
