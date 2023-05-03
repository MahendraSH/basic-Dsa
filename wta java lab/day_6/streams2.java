import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class streams2 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter the file name ");
        String f=cin.next();
        File file=new File(f);
        System.out.println(file.exists());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(file.length());
        System.out.println(file.getAbsolutePath());

        System.out.println(file.canRead());
    }
}
