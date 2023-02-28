package _2_;

import java.util.Scanner;
// print the n fibo numbers
public class fibonaci {
    public static void main(String[] args) {
        System.out.println("Enter the  a number");
        Scanner cin =new Scanner(System.in);
        int n=cin.nextInt();
        int n1=0;
        int n2=1;
        int count =2;
        while (count!=n){
           int temp=n1+n2;
            System.out.println(n1);
            n1=n2;
            n2=temp;
            count++;
        }
        System.out.println(n1);
        System.out.println(n2);
    }
}
