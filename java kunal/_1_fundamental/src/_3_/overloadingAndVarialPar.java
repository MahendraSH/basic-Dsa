package _3_;

import java.util.Arrays;

// overloading and variable parmeter
public class overloadingAndVarialPar {
    public static void main(String[] args) {
        sum(10,439);
        sum(192,43,53);
        sum("madhend","skind");
        print(24,3,53,53,5,35,35,3,4);
        print("4343","sldnsidn","4ksndus");

    }
    static  void  sum(int a ,int b)
    {
        System.out.println(a+b);
    }
    static void  sum(int a,int b,int c)
    {
        System.out.println(a +b +c);

    }
    static  void sum(String a ,String b)
    {
        System.out.println(a +b);
    }
    static  void print(int...v)
    {
        System.out.println(Arrays.toString(v));
    }
    static void print(String ...v){
        System.out.println(Arrays.toString(v));
    }

}
