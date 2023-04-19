package DataTypesVariableArrays;
// type casting
public class pro10 {
    public static void main(String[] args) {

        byte b;
        int i =257;
        double d= 290.34;
        System.out.println();
        System.out.println("convert int to byte ");
        b=(byte) i;
        System.out.println("b = "+b);
        System.out.println();
        System.out.println("convert double to int");
        i =(int) d;
        System.out.println("i ="+i);
        System.out.println();
        System.out.println("convert double  to byte ");
        System.out.println();
        b =(byte) d;
        System.out.println("b ="+b);

    }
}
