package _4_.ArraysInjava.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
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
        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return;
    }
    static  void reverse(int []arr){
        int start=0;
        int end =arr.length-1;
        while (start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println("start"+start);
        System.out.println("end"+end);
        return;
    }
}