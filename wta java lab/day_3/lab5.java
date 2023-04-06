package day_3;

abstract class A{
    int i;
    abstract void print();
    
}
class B extends A{
    
    void print() {
        System.out.println(" print in class B");
    }
}

class C extends A{
    
    void print() {
        System.out.println(" print in class  C");
    }
}


public class lab5 {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        A a;

        a = b;
        a.print();

        a = c;
        a.print();

    }
    
}
