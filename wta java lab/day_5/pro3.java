// arthmatic error
public class pro3 {
    public static void main(String[] args) {
        int a=100;
        int b=0;
        try {
            System.out.println(" a/b= "+(a/b));
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }

}
