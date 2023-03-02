import java.util.*;

public class nestedIfesle {
    public static void main(String[] args) {
        System.out.println("Enter amout ");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if (n > 10000) {
            System.out.println("phone");
            if (n > 80000) {

                System.out.println("ipone");
            } else if (n > 12000) {

                System.out.println("motoroala");
            } else {
                System.out.println("any phone");
            }

        } else if (n > 1000) {
            System.out.println("neck bands ");
            if (n > 2200) {
                System.out.println("sony");
            } else {
                System.out.println("any neck band");
            }

        } else {
            System.out.println("nothing is avl");
        }
    }
}
