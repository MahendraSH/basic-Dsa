package _5_.problems;
// find the count of eles in arrays that have even digits
import java.util.Arrays;
import java.util.Scanner;

public class EvenDigitCount {
    public static void main(String[] args) {
        System.out.println("Enter the  number of ele");
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        System.out.println("enter eles");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=cin.nextInt();
        System.out.println(Arrays.toString(arr));
       int ans= findCountEven(arr);
        System.out.println(ans);

    }
    static  int findCountEven(int []arr){
        int count=0;
        for(int i:arr){
            if(findNumOfdigits(i)%2==0){
                count++;
            }
        }
        return count;

    }
    static int findNumOfdigits(int n){
        int count =0;
        while (n!=0)
        {
            n/=10;
            count++;
        }
        return count;

    }
    static int  findDigitsfast(int n){
        int count= (int)Math.log10(n)+1;
        return count;

    }
}
