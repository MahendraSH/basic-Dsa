package _4_.ArraysInjava;

import java.util.Arrays;

public class MultiDImetionalways {
    public static void main(String[] args) {
        int [][]arr={
                {
                    1,3,44,34
                },
                {
                    1,3,3,4,4,5,5,4
                },{
                    24,34,3,43
        }
        };
        for(int []i :arr){
            System.out.println(Arrays.toString(i));
        }
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
