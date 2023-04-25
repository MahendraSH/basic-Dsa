import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Binput{

        void   displayAndPrint() throws IOException {
            System.out.println("Enter a line of text ");
            BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
            String c = cin.readLine();
            System.out.println(c);

        }
        void thowExtpion() throws Exception {
            throw new Exception("soem error ");

        }

}
public class pro10 {
    public static void main(String[] args) throws IOException {

        Binput b=new Binput();
        b.displayAndPrint();

        try{
            b.thowExtpion();
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
