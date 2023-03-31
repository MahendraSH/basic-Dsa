//wtajava10.java
// write program to accept the marks of students into on 1d arry 
// find the total marks and percetage

import java.util.Scanner;

public class wtaJava10 {
    public static void main(String[] args) {
        System.out.println("Enter the number of subjects ");
        Scanner cin = new Scanner(System.in);
        int n= cin.nextInt();
        System.out.println("Enter the subject marks");
         int []arr=new int[n];
                 for(int i=0;i<arr.length;i++)
                 {
                    arr[i]=cin.nextInt();
                 }

        int total=0;
         for(int i: arr)
         {
            System.out.print(arr[i]+" ");
            total += arr[i];
         }
         float avg =(float) total/arr.length;
         System.out.println("The total = "+total +"The avg "+avg);
         
         cin.close();

    }

}
