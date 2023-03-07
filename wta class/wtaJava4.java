// wtajava4.java
// write a program to take a char from keyboard using
// bufferedReader class
import java.io.*;
public class wtaJava4{
    public static void main(String ... args) throws IOException
    {
        BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
        char c = (char)cin.read();
        System.out.println("the entered char ="+c);
    }
}