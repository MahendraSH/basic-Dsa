// create a method without parmeter and with return type

package partice;

import java.util.Scanner;

class DemoOne1{
    private  int n1;
    private int n2;
    DemoOne1(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
    }
    int sum(){return n1+n2; }


}

public class pra7 {
    public static void main(String[] args) {
        int n1;
        int n2;
        System.out.println("The enter two numebrs and find the sum");
        Scanner cin=new Scanner(System.in);
        n1=cin.nextInt();
        n2=cin.nextInt();
        DemoOne1 demo= new DemoOne1(n1,n2);
        System.out.println(demo.sum());
    }
}
