package assignmentprograms;

// ass2.java
//  print the n fibonachi numbers 
import java.util.Scanner;

public class ass2 {
    public static void main(String[] args) {
        Scanner cin  =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=cin.nextInt();
        int t1=0;
        int t2=1;
        int count=0;
        while(count<n){
            System.out.print(t1+" ");
            int temp=t1+t2;
            t1=t2;
            t2=temp;
            count++;
          
        }
           cin.close();
    }
}
