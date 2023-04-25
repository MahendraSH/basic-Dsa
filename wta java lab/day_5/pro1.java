


public class pro1 {
    public static void main(String[] args) {
        String s=null;
        try
        {
            System.out.println("string lenght"+s.length());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }

    }
}
