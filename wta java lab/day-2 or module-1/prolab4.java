import java.util.Scanner;

public class prolab4 {
    public static void main(String[] args) {
        System.out.println("Enter the  number of elemsts");
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        System.out.println("Enter the eles");
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=cin.nextInt();
        }
        for(int i:arr)
        {
            System.out.print(i +" ");
        }
        System.out.println();
        cin.close();
    }
    
}
