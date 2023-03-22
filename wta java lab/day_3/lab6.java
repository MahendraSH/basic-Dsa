package day_3;
// Try to implement the concept of multiple inheritance in Java with the use of interface.

interface  Aintrface {
    int i=200;
    void printA();
}

interface  Binterface  {
    int j=300;
    void printB();
}

class Cimpements implements Aintrface, Binterface {
    public void printA() {
        System.out.println("the value i is " + i);
    }
    public void printB() {
        System.out.println("the value j is " + j);
    }
}

public class lab6 {
    

    public static void main(String[] args) {
        Cimpements c = new Cimpements();
        c.printA();
        c.printB();
    }
    
}
