import java.util.Scanner;

// ass3.java
//leap year progarm chek is leap or not 

public class ass3 {
    public static void main(String[] args) {
        System.out.println("Enter the  year ");
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        if(n%4==0){
            if(n%100==0)
            {
                if(n%400==0)
                {
                    System.out.println("leap year ");
                }
                else{
                    System.out.println("not leap year");
                }
            }
            else{
                System.out.println("leap year");
            }
        }else{
            System.out.println("not a leap year");
        }
        cin.close();
    }
}
