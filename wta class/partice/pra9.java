package partice;

import java.util.Scanner;

public class pra9 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("enter the uname id and salary");
        String uname =cin.next();
        int id = cin.nextInt();
        float salary = cin.nextFloat();
        String s= String.format("uname = %s \n id =%d \n salary = %f",uname,id,salary);
        System.out.println(s);
    }
}
