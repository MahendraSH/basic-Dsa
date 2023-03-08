
public class prolab6 {

    public static void main(String[] args) {
       int m=Integer.parseInt(args[1]);
       int n=Integer.parseInt(args[0]);

        int i = 1;
        while (i <= n) {
            System.out.println(m + " x " + i + " = " + (i * m));
            i++;
        }

    }
}
