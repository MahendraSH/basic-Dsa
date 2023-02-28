package _2_;

import java.util.Scanner;

public class calculatror {
    public static void main(String[] args) {
        System.out.println("Wellcome to calucator");
        Scanner cin =new Scanner(System.in);
        while (true)
        {

            System.out.println("Enter the operator \n for exit x or X ");
            char  operator =cin.next().charAt(0);
            if(operator=='+' || operator== '-' || operator=='*'|| operator=='/'|| operator=='%'){
                System.out.println("Enter the two numebers");
                int n1=cin.nextInt();
                int n2=cin.nextInt();
                if (operator=='+')
                {
                    System.out.println("result= "+(n1+n2));
                }
                else if (operator=='-')
                {
                    System.out.println("result= "+(n1-n2));
                }else if (operator=='*')
                {
                    System.out.println("result= "+(n1*n2));
                }else if (operator=='/')
                {
                    System.out.println("result= "+(n1/n2));
                }
                else {
                    System.out.println("result= "+(n1%n2));
                }


            } else if (operator=='x'|| operator=='X') {
                break;

            }else {
                System.out.println("invalied operator ="+operator);
            }


        }
    }
}

