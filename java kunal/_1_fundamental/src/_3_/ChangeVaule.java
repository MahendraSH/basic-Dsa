package _3_;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeVaule {
    public static void main(String[] args) {
        int []a={4,53,5,53};
        System.out.println(Arrays.toString(a));
        changeArr(a);
        System.out.println(Arrays.toString(a));
    }
    static void  changeArr(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=100;
        }
    }
//    in java there os call by reference or pointer
//    here  the value  of object is passed
//    it pass by value

}
