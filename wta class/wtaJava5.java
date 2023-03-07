
// wtaJava4.java 
//  write jav program for taking input name and id and usig 
// buffered reader class and readline 
import java.io.*;

public class wtaJava5 {
    public static void main(String[] args) throws IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter id");
        int id = Integer.parseInt(cin.readLine());
        System.out.println("Enter the name");
        String name =cin.readLine();
        System.out.println("Enter the salary");
        float salary =Float.parseFloat(cin.readLine());
        System.out.println("The id ="+id +"The name = "+name +"the salary ="+salary);
        
    }
}
