package _3_.problems;

import java.util.Scanner;

//print all amstrong numbers from 1 to given number
public class PrintAllamstrong {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner cin=new Scanner(System.in);
        printAmstrong(cin.nextInt());

    }
    static  void printAmstrong(int n)
    {
        for(int i=1;i<=n;i++)
        {
           if(findAmstrong(i)){
               System.out.print( i +" ");
           }
        }
        System.out.println();
    }
    static  boolean findAmstrong(int n)
    {
        int on =n;
        int sum=0;
        while (n!=0)
        {
            int last = n%10;
            sum=sum+(last*last*last);
            n/=10;
        }
        if(sum==on)
        {
            return true;
        }
        return false;
    }


}
