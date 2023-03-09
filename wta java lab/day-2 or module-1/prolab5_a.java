import java.util.Scanner;

public class prolab5_a {
    public static void main(String[] args) {
         System.out.println("Enter three number ");
         Scanner cin= new Scanner(System.in);
         int n1=cin.nextInt();
         int n2=cin.nextInt();
         int n3 =cin.nextInt();

         System.out.println("Sum with parmeter two sum(n1,n2) = "+sum(n1,n2));
         System.out.println("Sum with parmeter three sum(n1,n2,n3) = "+sum(n1,n2,n3));

         System.out.println("sum without parmeters um() = "+sum());

         

    }
    static int sum(int a ,int b){
        return a+b;
    }
    static int sum(){
        
        int n=20;
        int b=30;
        return n+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }

}
