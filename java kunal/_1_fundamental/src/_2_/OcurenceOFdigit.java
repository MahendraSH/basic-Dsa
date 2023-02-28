package _2_;

import java.util.Scanner;
// count the occurrence of a digit in number
public class OcurenceOFdigit {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner cin=new Scanner(System.in);
        int n= cin.nextInt();
        int count =0;
        System.out.println("Enter the digit to find occurrence");
        int d= cin.nextInt();
        while (n!=0)
        {
            int last =n%10;
            n/=10;
            if(last ==d)
            count ++;
        }
        System.out.println(count);
    }
}
