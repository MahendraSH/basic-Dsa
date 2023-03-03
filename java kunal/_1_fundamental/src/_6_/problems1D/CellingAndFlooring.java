package _6_.problems1D;
//find celling and flooring in arrays
import  java.util.Scanner;
public class CellingAndFlooring {
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
        int cellling =Celling(a,target);
        int flooring =Flooring(a,target);
        System.out.println("celling index "+cellling +" and ele ="+a[cellling]);
        System.out.println("flooring index "+flooring +" and ele ="+a[flooring]);


    }

    private static int Celling(int[] arr, int target) {

        if(target> arr[arr.length-1]) return  -1;
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
        return  end;

    }private static int Flooring(int[] arr, int target) {
        if(target<arr[0]) return -1;

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
        return  start;

    }


}


