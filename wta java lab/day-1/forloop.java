import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");

    }
}
