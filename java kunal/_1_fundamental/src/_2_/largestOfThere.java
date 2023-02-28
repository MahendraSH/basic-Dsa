package _2_;

import java.util.Scanner;

// find largest of there numbers
public class largestOfThere {
    public static void main(String[] args) {
        System.out.println("Enter  there numbers");
        Scanner cin= new Scanner (System.in);
        int maxele =cin.nextInt();
        int b= cin.nextInt();
        int c= cin.nextInt();
//        if (maxele <b) {
//            maxele = b;
//        }
//        if (maxele< c)
//        {
//            maxele=c;
//
//        }
//        System.out.println( maxele);
//        ----------------------------- using math.max
        maxele=Math.max(b,Math.max(c,maxele));

        System.out.println(maxele);
    }
}
