package partice;

import java.util.Scanner;

public class pra8 {
    public static void main(String[] args) {
//        taking input of emp using  scanner class
        Scanner cin=new Scanner(System.in);
        System.out.println("Entet the uname id and salary");
        String uname =cin.next();
        int id =cin.nextInt();
        float salary =cin.nextFloat();
        System.out.println("the uname = "+uname +"the id ="+id + "the salary = "+salary);

    }
}
