import java.util.Scanner;

class AddNumbers {
    private int n1;
    private int n2;

    AddNumbers() {
        n1 = 1;
        n2 = 1;
    }

    AddNumbers(int num1, int num2) {
        n1 = num1;
        n2 = num2;
    }

    int findSum() {
        return n1 + n2;
    }
}

public class prolab5_b {
    public static void main(String[] args) {
       
       Scanner cin=new Scanner(System.in);
       System.out.println( "Enter two numbes");
       AddNumbers numbers1=new AddNumbers(cin.nextInt(),cin.nextInt());
       AddNumbers numbers2 =new AddNumbers();
       System.out.println("The default constructor == sum output ="+numbers2.findSum());
       System.out.println("The parmeterised constructor == sum output ="+numbers1.findSum());
    }
}
