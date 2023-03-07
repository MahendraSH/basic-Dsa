import java.util.Scanner;

// wtaJava9.java
// formated output using  string class

public class wtaJava9 {
    public static void main(String[] args) {
        System.out.println("Enter the emp id ,name ,and the salary");
        Scanner cin = new Scanner(System.in);
        int id = cin.nextInt();
        String name = cin.next();
        float salary = cin.nextFloat();
        // String s =String.format(name, args)

        String s = String.format(
                "emp id =%d \n emp name =%s %n emp salary =%f %n", id, name, salary);

                System.out.println(s);
        cin.close();
    }

}
