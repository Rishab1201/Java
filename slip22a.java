import java.io.*;
public class slip22a {
    public static  void main(String[] args) {
        createFile("newfile.txt");
        
        renameFile("file1.txt","newfile2.txt");

        displayPath("newfile.txt");

        deleteFile("file1.txt");
    }

    public static void createFile(String filename){
        try{
            File file= new File(filename);
            if(file.createNewFile()){
                System.out.println("file created:"+filename);

            }
            else{
                System.out.println("file already exsist"+filename);
            }
        }catch(IOException e)
        {
         System.out.println("an error occured:"+e.getMessage());
        }
    }

    public static void renameFile(String oldname,String newname){
            File oldFile= new File(oldname);
            File newFile= new File(newname);

            if(oldFile.exists()){
                System.out.println("file renamed to:"+newname);
            }else {
                System.out.println("Failed to rename file");
            }
        
    }

    public static void displayPath(String filename){
        File file=new File(filename);
        if(file.exists()){
            System.out.println("path of the file:"+file.getAbsolutePath());
        }
        else {
            System.out.println("File doesn't exist: " + filename);
        }
    }

    public static void deleteFile(String filename){
        File file = new File(filename);
        if(file.exists()){
            if(file.delete()){
                System.out.println("file deleted:"+filename);
            }
               else{
                System.out.println("Failed to delete file");
               }
        }
        else{
            System.out.println("File doesn't exist: " + filename);
        }
    }

    }

