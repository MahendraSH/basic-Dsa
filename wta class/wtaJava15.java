
// write a program to use of method in class
class Number{
     private int n;
    Number(int value){
       
        n=value;
    }
    public int getValue(){
        return n;
    }
    public void setValue(int value){
        n=value;
    }
    boolean isOdd(){return (n%2==1);}
    boolean isEven(){return (n%2==0);}
    void display(){
        System.out.println("The number is " +n);
    }
}
public class wtaJava15{
    public static void main(String[] args) {
        Number n1=new Number(10);
        n1.display();
        System.out.println("The number is even "+n1.isEven());
        System.out.println("The number is ood "+n1.isOdd());
        n1.setValue(11);
        n1.display();
        System.out.println("The number is even  "+n1.isEven());
        System.out.println("The number is ood "+n1.isOdd());
        n1.setValue(30);
        n1.display();
        System.out.println("The number is even  "+n1.isEven());
        System.out.println("The number is ood "+n1.isOdd());

        
    }
}