import java.io.*;

public class Slip5A {
  public static void main(String args[]) {
    File f;
    for (int i = 0; i < args.length; i++) {
      f = new File(args[i]);
      if (f.exists()) {
        if (args[i].endsWith(".txt")) {
          f.delete();
          System.out.println("File deleted:" + args[i]);
        }

        else {
          System.out.println("File not txt details are:");
          System.out.println("File Name:" + f.getName());
          System.out.println("File location is:" + f.getPath());
          System.out.println("Filt size is:" + f.length());
        }
      } else
        System.out.println("\tFile not found:" + args[i]);
      System.out.println("\t-------------------------------");
    }
  }
}