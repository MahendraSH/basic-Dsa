package _2_;

import java.util.Scanner;
//reverse and check palindrome

public class reverse {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner cin= new Scanner(System.in);
        int sum=0;
        int n=cin.nextInt();
        int on=n;
        while (n!=0)
        {
            int last =n%10;
            sum=sum*10+last;
            n/=10;

        }
        System.out.println("revers = "+sum);
        if (sum== on){
            System.out.println("pallindrome");
        }
        else {
            System.out.println("not a pallindrome");
        }
    }
}
