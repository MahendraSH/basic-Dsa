package day_3;
// day_3lab1
////
//2. Demonstrate the use of super keyword in inheritance and try to implement the program which can able to perform following operations…
//        a. Use super to call base class variable.
//        b. Use super to call base class method.
//        c. Use super to call base class constructor
class  Supper1{
    int i=100;
    Supper1(int i)
    {
        this.i =i;
    }
    public void show(){
        System.out.println("supper1  i = "+i);
    }
}
class Sub1 extends Supper1{
    int j=200;
    Sub1(int i,int j){
        super(i);
        this.j=j;

    }
    public void show(){
        System.out.println("sub1  j = "+i);
        super.show();
        System.out.println("Supper.i = "+super.i);
    }
}
public class day3lab1 {

    public static void main(String[] args) {

        Sub1 s2=new Sub1(10,200);
        s2.show();

    }

}


