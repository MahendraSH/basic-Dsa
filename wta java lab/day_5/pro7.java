//nested try catch
public class pro7 {
    public static void main(String[] args) {
        try{
            int []arr={943,353};
            try {
                int b=20/0;

            }
            catch(ArithmeticException e) {
                System.out.println(e);

            }

            System.out.println(arr[20]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
