package internalsONe;

class A {
    A(){
        System.out.println("default A");
    }
    A(String s){
        System.out.println("par A");
    }
}

class B extends A {
    B() {
        super();

        System.out.println("default B");
    }

    B(String s) {
        super(s);
        new B();
        System.out.println("parter B");
    }
}



public class Q3 {
    public static void main(String[] args) {
        B b2 = new B("djnsud");
    }
}
