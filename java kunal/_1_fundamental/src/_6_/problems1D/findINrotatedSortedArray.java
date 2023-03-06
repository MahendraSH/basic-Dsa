package _6_.problems1D;

import javax.xml.stream.events.StartDocument;
import java.util.Arrays;

public class findINrotatedSortedArray {
    public static void main(String[] args) {
        int []arr ={22,33,44,54,89,4,3,2,1};
        int target =3;
//        find pivote
        int pivote =findPivote(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The number of time the area is rotated =" +(arr.length-pivote-1));
        System.out.println(pivote);
        System.out.println(arr[pivote]);
//         after find pivote
        if (target ==arr[pivote])
        {
            System.out.println("target at ="+pivote);
        }
        if(target> pivote)
        {
            System.out.println("Targetnot foound");
        }
        if(target> arr[pivote+1])
        {
            System.out.println("target at ="+biSearhinc(arr,0,pivote-1,target));
        }
        else{
            System.out.println("target at ="+biSearhinc(arr,pivote+1,arr.length-1,target));
        }

    }
    static  int findPivote(int []arr){
        int start =0;
        int end=arr.length-1;
        while (start<end)
        {
             int mid=start+(end-start)/2;// 4
             if(arr[mid]<arr[mid+1])
             {
//                 u are in increaing part
                 start =mid+1;


             }
             else {
                 // u are in roted part
                 end =mid;


             }
        }
        return  end;

    }
    public static int biSearhinc(int [] arrRotaed,int start ,int end,int target){

        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(arrRotaed[(mid)]==target){
                return mid;
            }
            else  if(arrRotaed[(mid)]>target){
                end =mid-1;
            }
            else {
                start=mid+1;
            }


        }
        return  -1;

    }

    public static int biSearchdec(int [] arrRotaed,int start ,int end,int target){

        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(arrRotaed[(mid)]==target){
                return mid;
            }
            else  if(arrRotaed[(mid)]<target){
                end =mid-1;
            }
            else {
                start=mid+1;
            }





        }
        return  -1;

    }
}
