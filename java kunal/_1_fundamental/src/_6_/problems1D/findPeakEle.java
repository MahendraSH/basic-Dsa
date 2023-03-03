package _6_.problems1D;

import java.util.Arrays;

public class findPeakEle {
    public static void main(String[] args) {
        int [] mountainArr={1,3,4,55,66,77,65,54,43,2};
        System.out.println(Arrays.toString(mountainArr));
        System.out.println(findPeekIndex(mountainArr));
        System.out.println(mountainArr[findPeekIndex(mountainArr)]);
    }
    static int findPeekIndex(int []arr){
        int start=0;
        int end=arr.length-1;
        while (start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid] >arr[mid+1])
            {
                end=mid;
            }
            else{
                start=mid+1;
            }

        }
        return start;
    }
}
