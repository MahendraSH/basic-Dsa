package _6_.binearySearchIntro;

import java.util.Scanner;

public class binearySearch {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        Scanner cin=new Scanner(System.in);
        int n= cin.nextInt();
        System.out.println("Enter the eles");
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=cin.nextInt();
        }
        int target;
        System.out.println("Enter the target");
        target= cin.nextInt();
        System.out.println(biSearch(a,target));

    }
    static  int biSearch(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end =mid-1;
            }
            else {
                start=mid+1;
            }

        }
        return  -1;

    }
}
