// write a progarm to test static method can exess static variable

class Demo {
    static int x = 100;

    static void displayX() {
        System.out.println("The x = " + x);

    }
}

public class wtaJava20 {
    public static void main(String[] args) {
        Demo.displayX();

    }
}