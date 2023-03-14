// write a class Supper1 with an instance var and show method 
// extend a class sub1 from supper1 and rewite the instance var and show method
//  make  an obj of sub class and call show method
// by using supper keyword

class  Supper1{
    int i=100;
    public void show(){
        System.out.println("supper1  i = "+i);
    }
}
class Sub1 extends Supper1{
    int i=200;
    public void show(){
        System.out.println("sub1  i = "+i);
         super.show();
         System.out.println("Supper.i = "+super.i);
    }
}
public class wtaJava26 {
    
    public static void main(String[] args) {
        
        Sub1 s2=new Sub1();
        s2.show();

    }
}
