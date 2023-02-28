package _3_.problems;
// is prime or not
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner cin=new Scanner(System.in);
        System.out.println(isPrime(cin.nextInt()));
    }
    static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++)
        {
             if(n%i== 0){
                 return false;
             }
        }
        return true;
    }
}
