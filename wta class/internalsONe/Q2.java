package internalsONe;

public class Q2 {
    public static void main(String[] args) {
        int x=2;
        int m =5 & 6;
        System.out.println(m);
        int n=m^3;
        System.out.println(n);
        System.out.println(n|12);
        String result= m>n? "good":"bad";
        System.out.println(result);
        x=x>>1;
        System.out.println(x);
        int y=x<<2;
        System.out.println(y);
    }
}
