package partice;
// take char input using java calss bufferinput
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pra4 {
    public static void main(String[] args) throws IOException {
        BufferedReader cin =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a char");
        char c = (char) cin.read();
        System.out.println("The c = "+c);



    }
}
