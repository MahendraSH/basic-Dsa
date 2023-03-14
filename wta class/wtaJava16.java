//  create a method with out parmeter and with out return type
class Demo{
    private int n1;
    private int n2;
    public Demo(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    void sum()
    {
        System.out.println("sum = "+(n1+n2));
    }
}
public class wtaJava16 {
    
    public static void main(String[] args) {
        Demo d =new Demo(10,30);
        d.sum();
        
    }
}
