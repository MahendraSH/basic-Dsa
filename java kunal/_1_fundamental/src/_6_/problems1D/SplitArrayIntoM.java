package _6_.problems1D;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;

public class SplitArrayIntoM {
    public static void main(String[] args) {
        int []arr={ 7,2,5, 10,8};
        System.out.println(Arrays.toString(arr));
        int m=2;
        System.out.println("The m ="+m);

        System.out.println(minimizeThelargetSum(arr,m));


    }
    static int findMax(int []arr){
        int maxele=Integer.MIN_VALUE;

        for(int i :arr){
            if(maxele<i)
                maxele=i;
        }
        return maxele;
    }
    static  int findSum(int []arr){
        int ans=0;
        for(int i:arr){
            ans+=i;
        }
        return ans;
    }
    static int  minimizeThelargetSum(int []arr,int m){
       int start =findMax(arr);
      int end=  findSum(arr);

        System.out.println(start);
        System.out.println(end);
      while (start<end){
          int mid=start+(end-start)/2;
          int peaces=1;//the number of peaces init is 1 so think it
          int sum=0;
          for(int i :arr){
              if(sum+i>mid){
                  peaces++;
                  sum=0;
              }
              sum+=i;
          }
          if(peaces>m){
              start=mid+1;
          }
          else {
              end=mid;
          }
      }
      return  end;

    }
}
