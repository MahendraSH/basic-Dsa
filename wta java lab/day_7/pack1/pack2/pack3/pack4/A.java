package pack1.pack2.pack3.pack4;

import pack1.pack2.pack3.Calculate;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Calculate c =new Calculate();
        System.out.println("Enter two numbers ");
        Scanner cin=new Scanner(System.in);
        c.cal(cin.nextInt(),cin.nextInt());
    }
}
