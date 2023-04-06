package day_3;
// Demonstrate the use of super keyword in inheritance and try to 
// implement the program which can able to perform following operations…
// a. Use super to call base class variable.
// b. Use super to call base class method.
// c. Use super to call base class constructor.

class Supper1 {
    int i=100;
    Supper1(int i){
        this.i=i;
    }
    void show()
    {
        System.out.println("the supper class i = " + i);
    }
}

class Sub1 extends Supper1
{
    int j=200;
    Sub1(int i,int j){
        super(i);
        this.j=j;
    }
    void show()
    {
        super.show();
        System.out.println("the super. i = " +super.i);
        System.out.println("the subclass j = " +j);
    }

}

public class lab2 {
    public static void main(String[] args) {
        
        Supper1 s1 = new Supper1(10);
        Sub1 s2 = new Sub1(20,200);
        s1.show();
        s2.show();
    }
    
}
