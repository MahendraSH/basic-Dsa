package _3_;
/*
   function general  format

     access-modifier  return-type function-name(parmeters){
          body
          return stament
     }


 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
//        sum();
//        System.out.println(sum(10,4));
        sum(10,4);
    }

//     static int sum(int a, int b) {
//        return a+b;
//    }
    static void sum(int a , int b) {
        System.out.println(a+b);
    }


    static  void  sum()
    {
        System.out.println("Enter a number1");
        Scanner cin=new Scanner(System.in);
        int n1=cin.nextInt();
        System.out.println("Enter a number2");
        int n2 = cin.nextInt();
        System.out.println("The sum =" + (n1+n2));

    }
}
