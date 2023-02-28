package _1_;
// type casting


import java.util.Scanner;

public class typeConvertion {
    public static void main(String[] args) {
//  -----------      auto type conversion wil taking input
        Scanner cin=new Scanner(System.in);
//        float f= cin.nextFloat(); // if u give int value it is converted to float
//        System.out.println(f);
//
// ---------------- type casting
//        int n=(int)8943.5f;
//        System.out.println(n);
//        int a='a';
//        System.out.println(a);
//        int A ='A';
//        System.out.println(A);
//
//---------------- conversion during  expression
//        byte b=59;
//        byte a=49;
//
//        System.out.println(b*a);
// ----------------- example of conversion
//        int a=90;
//        int b=9;
        int a=1000;
        byte  b=40;
        float c= 200.67F;
        double f=40;
        double d =a * b +b *c/f ;
        System.out.println((a*b)+" "+(b*c));
        System.out.println(d);


    }
}
