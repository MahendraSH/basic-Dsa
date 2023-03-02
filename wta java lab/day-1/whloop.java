import java.util.Scanner;


public class whloop {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(n +" x " +i +" = "+(i*n));
            i++;
        }

    }

}
