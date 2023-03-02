import java.util.Scanner;

public class laderIfElse {
    public static void main(String[] args) {
        System.out.println("Enter the  marks");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if (n > 90) {
            System.out.println("S ");
        } else if (n > 80) {
            System.out.println("A");
        } else if (n > 70) {
            System.out.println("B");
        } else {
            System.out.println("c");
        }
    }
}
