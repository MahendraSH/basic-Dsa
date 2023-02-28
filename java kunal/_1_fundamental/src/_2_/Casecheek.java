package _2_;

import java.util.Scanner;

public class Casecheek {
    public static void main(String[] args) {
        System.out.println("Enter a char");
        Scanner cin=new Scanner(System.in);
        char c= cin.next().charAt(0);
        System.out.println(c);
        if(c>='a' && c<='z')
        {
            System.out.println("lowercase");
        }
        else if (c>='A' && c<='Z'){
            System.out.println("upper Case");
        }
        else {
            System.out.println("some symbol");
        }
    }
}
