import java.io.*;
import java.util.*;

// wtaJava6.java
//   write java program for taking input name and id and using <br>
//  buffered reader class and readline and strigTokennizer class (util) getnexttoken()<br>



public class wtaJava6{
    public static void main(String[] args) throws IOException
    {
        BufferedReader cin =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the id ,name and salary of emp");
        
        StringTokenizer token =new StringTokenizer(cin.readLine());
           
        int id =Integer.parseInt(token.nextToken());
        String name =token.nextToken();
        float salary =Float.parseFloat(token.nextToken());
        System.out.println("The id ="+id +"The name ="+name +"The salary ="+salary);
        

    }
}