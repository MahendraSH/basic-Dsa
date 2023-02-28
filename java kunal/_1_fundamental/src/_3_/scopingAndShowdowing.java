package _3_;
// scoping and shodowing in java run and see
public class scopingAndShowdowing {
    static int n=100;

    public static void main(String[] args) {
        System.out.println(n);
        int n=424;
        System.out.println(n);
        fun();

    }
    static void fun()
    {
        System.out.println(n);
    }
}
