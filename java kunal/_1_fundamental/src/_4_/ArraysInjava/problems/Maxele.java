package _4_.ArraysInjava.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Maxele {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("enter the arr length");
        int n=cin.nextInt();
        int []arr=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=cin.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(maxele(arr));

    }

    static int maxele(int[] arr) {
        int max=Integer.MIN_VALUE;
//        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }

}
