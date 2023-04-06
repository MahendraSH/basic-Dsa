package partice;

import java.util.Scanner;

public class pra10 {
    public static void main(String[] args) {
//        take n subject marks in array and find total and avg
        Scanner cin =new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int n=cin.nextInt();
        System.out.println("Enter the marks of each subject ");

        int []arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=cin.nextInt();

        }
        int sum=0;
        for(int i :arr)
        {
            sum+=i;
        }
        System.out.println("The total sum ="+sum +"the avg ="+(float)(sum/arr.length));


        System.out.println();
    }
}
