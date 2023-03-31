// create a method with out parmeter and with return type
class Demo1 {
    private int n1;
    private int n2;

    Demo1(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    int sum() {
        return n1 + n2;
    }
}

public class wtaJava17 {
    public static void main(String[] args) {
        Demo1 d = new Demo1(10, 20);
        System.out.println("The sum = " + d.sum());
    }
}