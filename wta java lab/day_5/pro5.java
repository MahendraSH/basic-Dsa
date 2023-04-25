
public class pro5 {
    public static void main(String[] args) {
        String s="diuns";
        try{
            System.out.println("string at  index 10"+s.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
