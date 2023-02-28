package _5_.problems;

import java.util.Arrays;
import java.util.Scanner;

public class minele {
    public static void main(String[] args) {
        System.out.println("Enter the  number of ele");
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        System.out.println("enter eles");
      int []arr=new int[n];
      for(int i=0;i<n;i++)
          arr[i]=cin.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println(min(arr));

    }
    static int min(int []arr){
        int minmum=Integer.MAX_VALUE;
        for(int i :arr)
        {
            if(i<minmum){
                minmum =i;
            }
        }
        return minmum;
    }
}
