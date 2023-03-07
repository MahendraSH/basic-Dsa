// wtaJava7.java
//  progam using scanner class takeing emp info

import java.util.Scanner;

public class wtaJava7{
    public static void main(String[] args) {
    
        Scanner cin =new Scanner(System.in);
        System.out.println("Enter the id name and salary");
        int id =cin.nextInt();
        String name =cin.next();
        float salary =cin.nextFloat();
        System.out.println(
            "The name ="+name+"The id ="+id +"salary ="+ salary
        );
        cin.close();

    }
}