// prolab2b
// Write a Java Programs to demonstrate the usage of the following:
// b. Java’s Operators and Expressions
public class prolab2b {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println();
        System.out.println("arthematic opetaotors");
        System.out.println("opeator + (a+b )-> "+(a+b));
        System.out.println("opeator - (a-b )-> "+(a-b));
        System.out.println("opeator * (a*b )-> "+(a*b));
        System.out.println("opeator / (a/b )-> "+(a/b));
        System.out.println("opeator % (a%b )-> "+(a%b));
        System.out.println();
        System.out.println("logical operators");
        System.out.println("opeator == (a== b )-> "+(a==b));
        System.out.println("opeator != (a!= b )-> "+(a!=b));
        System.out.println("opeator < (a<b )-> "+(a<b));
        System.out.println("opeator > (a>b )-> "+(a>b));
        System.out.println();

        System.out.println(" bit wise opeators and terneary ");
        
        int c = 20;
        System.out.println("c ="+c);
        System.out.println(a < b && a < c);// false && true = false
        System.out.println(a < b & a < c);// false & true = false
        System.out.println(a < b || a < c);// false || true = true
        System.out.println(a < b | a < c);// false |true = true

        int min = (a < b) ? a : b;
        System.out.println("int min=(a<b)?a:b -> min="+min);

        System.out.println("a>>b ->"+(a>>b));
        System.out.println("a>>>b ->"+(a>>>b));
        System.out.println("a<<b ->"+(a<<b));
 

    }
}