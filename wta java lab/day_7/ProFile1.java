import java.io.*;
import java.util.Scanner;

public  class ProFile1  {
    public static void main(String[] args) throws IOException {
        Scanner cin= new Scanner(System.in);
        System.out.println("Enter the file name ");
        File file = new File(cin.next());

        BufferedReader fin = new BufferedReader(new FileReader(file));
        String line;
        while ((line=fin.readLine())!=null){
            System.out.println(line);
        }




    }
}