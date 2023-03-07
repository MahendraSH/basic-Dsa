//  format out using pritf() like c 
import java.util.Scanner;
public class wtaJava8 {
    public static void main(String[] args) {
        System.out.println("Enter the emp id ,name ,and the salary");
        Scanner cin=new Scanner(System.in);
        int id=cin.nextInt();
        String name =cin.next();
        float salary =cin.nextFloat();
          System.out.printf(
            "emp id =%d \n emp name =%s %n emp salary =%f %n",id,name,salary
            );

    }

    
}
