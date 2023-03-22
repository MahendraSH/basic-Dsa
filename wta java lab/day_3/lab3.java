package day_3;
// Demonstrate the use of final keyword with respect to
// a. Variable
// b. Method
// c. Class

final class FinalClass{
    FinalClass(){
        System.out.println("The final class it cannot be inherited or extended");
    }
}
class Demo{
    final int i=100;
    final void showi(){
         System.out.println("The vaule final varible of i is " + i);
         System.out.println("it is inside final function");
         System.out.println("this function can not be overloaded function overloading cannot be done");
    }
}


public class lab3 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.showi();
        
    }
    
}
