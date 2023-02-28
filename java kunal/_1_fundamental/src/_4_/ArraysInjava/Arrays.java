package _4_.ArraysInjava;

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
//        int []a={4,5,5,45,4,64,6};
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.print(a[i] +" ");
//        }
//
        /// ---------------------------------------
        System.out.println();
        System.out.println("Enter the length");
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int []arr= new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=cin.nextInt();
        }
        for (int i:arr)
        {
            System.out.print(i +" ");

        }
        System.out.println();
        System.out.println(java.util.Arrays.toString(arr));
    }

}
