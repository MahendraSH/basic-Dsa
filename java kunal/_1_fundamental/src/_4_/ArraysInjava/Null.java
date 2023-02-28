package _4_.ArraysInjava;


import java.util.Arrays;
import java.util.Scanner;

public class Null {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int []arr=new int [5]; // all are zero
        System.out.println(Arrays.toString(arr));
        String  []str =new String[5]; // all are null
        System.out.println(Arrays.toString(str));
        for(int i=0;i<str.length;i++){
            str[i]=cin.next();
        }

        System.out.println(Arrays.toString(str));
    }

}
