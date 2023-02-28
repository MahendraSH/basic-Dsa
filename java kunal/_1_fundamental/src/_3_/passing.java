package _3_;

import com.sun.security.jgss.GSSUtil;

public class passing {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println("a ="+a+ " b ="+b);// passing by value
//        passing by value occurres with primitve and string
//        in jav strings can not be modified they can be new crated

String name ="Mahendra";
changeName(name);
        System.out.println(name);

    }
     static  void changeName(String naam){
        naam= "manju";

    }

    static void  swap(int a,int b)
    {
        int temp=a ;
        a=b;
        b=temp;

    }

}
