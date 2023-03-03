package _6_.problems1D;


import java.util.Arrays;

// Find First and Last Position of Element in Sorted Array
public class FisrtAndLast {
    public static void main(String[] args) {
        int []arr={
                5,7,7,8,8,10
        };
        int target = 8;
        int []ans=findFirtAndLast(arr,target);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));
    }
    static  int [] findFirtAndLast(int []arr,int target)
    {
        int []ans={-1,-1};
        ans[0]=firstPostion(arr,target);
        ans[1]=lastPostion(arr,target);
        return  ans;
    }
    static int firstPostion(int []arr, int target){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans =mid;
                end =mid-1;

            }
            else if(arr[mid]>target){
                end=mid-1;

            }
            else {
                start =mid+1;
            }
        }
        return  ans;
    }
    static int lastPostion(int []arr, int target){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans =mid;
//                end =mid-1;
                start =mid+1;

            }
            else if(arr[mid]>target){
                end=mid-1;

            }
            else {
                start =mid+1;
            }
        }
        return  ans;
    }
}
