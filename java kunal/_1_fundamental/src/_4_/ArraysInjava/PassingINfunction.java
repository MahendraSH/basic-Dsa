package _4_.ArraysInjava;

import java.util.Arrays;

public class PassingINfunction {
    public static void main(String[] args) {
        int []arr=  {
            1,324,424,244
        };
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static  void change (int []arr){
        arr[0]=0;
    }
}
