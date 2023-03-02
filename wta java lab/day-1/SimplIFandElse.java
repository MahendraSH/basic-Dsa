//  simple if and else 
import java.util.Scanner;

public class SimplIFandElse {
    public static void main(String[] args) {
        System.out.println("Enter the marks ");
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        if(n>50){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
