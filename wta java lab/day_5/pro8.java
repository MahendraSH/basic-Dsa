import com.sun.security.jgss.GSSUtil;

// execption and overloading methods
class Divide{

    int divide(int x,int y){
 return x/y;
    }
    int divide(int x,int y ,int z){
        return x/y/z;
    }
}
public class pro8 {
    public static void main(String[] args) {

        try{
            Divide d1=new Divide();
            try{

                d1.divide(20,0,0);
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }

            d1.divide(10,0);


        }catch (ArithmeticException e){
            System.out.println(e);
        }

    }
}
