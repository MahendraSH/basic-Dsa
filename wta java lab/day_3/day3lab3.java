package day_3;

// 3. Demonstrate the use of final keyword with respect to <br>
// a. Variable <br>
// b. Method <br>
// c. Class <br>

final class Demo{
    Demo(){
        System.out.println(
            "These class can not be inherited or extended as its a final class"
            );
    }


    
}

class TwoNumbers{
  final int n1, n2;

    TwoNumbers( int n1, int n2){
        this.n1 = n1;
        this.n2=n2;
    }
    final int sum(){
        return (n1 + n2);
    }
}

public class day3lab3 {
    
    public static void main(String[] args) {
        Demo demo = new Demo();
        TwoNumbers twoNumbers =new TwoNumbers(19,20);
        
        System.out.println("The sum of the two numbers ="+twoNumbers.sum());



    }

}
