
import java.util.Scanner;

public class prolab3 {
    public static void main(String[] args) {
        System.out.println("Enter the  number elements");
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=cin.nextInt();
        }
        for(int i :arr)
        {
           if(i%2==1){
            continue;
           }
           if(i<0){
            System.out.println("The entered numbers has negtive");
            break;
           }
           System.out.print( i+ " ");
        }
    }
}
