import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

Scanner cin=new Scanner(System.in);

        System.out.println("Enter two numbers ");
        int n1=cin.nextInt();
        int n2=cin.nextInt();
        System.out.println("sum ="+(n1+n2));
        System.out.println("mul ="+(n1*n2));
        System.out.println("diff ="+(n1-n2));
        System.out.println("div="+(n1/n2));
        System.out.println("rem="+(n1%n2));

    }

}
