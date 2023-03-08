import java.util.Scanner;


// prolab1.java
// Write a program in java to display message.
public class prolab1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String message = cin.nextLine();
        System.out.println("Hello world " + message);
        cin.close();
    }
}