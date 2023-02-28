package _4_.ArraysInjava;

import java.util.Arrays;
import java.util.Scanner;

public class Mulidimetional {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
//        int [][]arr={
//                {
//                    24,43,4
//                },{
//                    4,3,5
//        }
//        };
//        for(int i=0;i<arr.length;i++)
//        System.out.println(Arrays.toString(arr[i]));
        int [][]arr =new int [4][4];
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=cin.nextInt();
            }
        }
        for(int []i :arr){
            System.out.println(Arrays.toString(i));
        }
        System.out.println();
    }
}
