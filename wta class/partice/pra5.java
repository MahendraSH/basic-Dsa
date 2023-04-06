package partice;
// taeke input name id and salray using bufferReaderclass
import  java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class pra5 {
    public static void main(String[] args) throws IOException {
        BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the uname");
        String uname =cin.readLine();
        System.out.println("Enter the id");
        int id = Integer.parseInt(cin.readLine());
        System.out.println("Enter the salary");
        float salary =Float.parseFloat(cin.readLine());
        System.out.println("the uname ="+ uname+
        "The id = "+id+
        "the salary = "+salary);


    }
}
