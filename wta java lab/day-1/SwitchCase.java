import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner cin=new Scanner(System.in);
        int key=cin.nextInt();
        switch (key) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                 System.out.println("two");
               break;
            case 3:
                 System.out.println("three");
               break;
            case 4:
                 System.out.println("four");
               break;
            case 5:
                 System.out.println("five");
               break;
            case 6:
                 System.out.println("six");
               break;
        
            default:
            System.out.println("somthing I am learing still");
                break;
        }
    }
}
