
import java.util.Scanner;


public class dowhile {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int i = 1;
       do{
            System.out.println(n +" x " +i +" = "+(i*n));
            i++;
        } while(i<=10);

    }

}

