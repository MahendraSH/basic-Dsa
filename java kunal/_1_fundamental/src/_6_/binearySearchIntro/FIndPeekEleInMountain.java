package _6_.binearySearchIntro;

import java.util.Arrays;

public class FIndPeekEleInMountain {
    public static void main(String[] args) {
   int [] arr={1,23,24,53,66,77,65,44,33,2};
   int target=44;
        System.out.println(Arrays.toString(arr));
        System.out.println("target ="+target);
        System.out.println(findInMountainArray(target,arr));
    }

   static  public int findInMountainArray(int target, int [] mountainArr) {
        int peek=findPeekIndex(mountainArr);
        if(mountainArr[(peek)]==target){
            return peek;
        }
        int ans=-1;
        ans=biSearhinc(mountainArr,0,peek-1,target);
        if(ans==-1){
            ans=biSearchdec(mountainArr,peek+1,mountainArr.length-1,target);
        }
        return ans;
    }
    public  static int findPeekIndex(int [] mountainArr){

        int start=0;
        int end =mountainArr.length-1;
        while (start<end)
        {
            int mid=start+(end-start)/2;
            if(mountainArr[mid] >mountainArr[mid+1])
            {
                end=mid;
            }
            else{
                start=mid+1;
            }

        }
        return start;
    }
    public static int biSearhinc(int [] mountainArr,int start ,int end,int target){

        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(mountainArr[(mid)]==target){
                return mid;
            }
            else  if(mountainArr[(mid)]>target){
                end =mid-1;
            }
            else {
                start=mid+1;
            }


        }
        return  -1;

    }

    public static int biSearchdec(int [] mountainArr,int start ,int end,int target){

        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(mountainArr[(mid)]==target){
                return mid;
            }
            else  if(mountainArr[(mid)]<target){
                end =mid-1;
            }
            else {
                start=mid+1;
            }





        }
        return  -1;

    }

}
