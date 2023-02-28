package _5_;

import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter the number of eles");
        int n= cin.nextInt();

        int []arr=new int [n];
        System.out.println("enter eles");
        for(int i=0;i<n;i++)
        {
            arr[i]= cin.nextInt();
        }
        System.out.println("enter target");
        int target=cin.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr,target));
    }

    static int search(int []arr,int target){
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==target)
                return i;

        }
        return -1;
    }
}
