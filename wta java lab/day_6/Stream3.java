import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stream3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("my.txt");
        BufferedReader cin=new BufferedReader(new InputStreamReader(fin));

        String s;
        int count=0;


        while (( s=cin.readLine())!=null){
            System.out.println((count+1)+")  "+s);
            count++;

        }
    }
}
