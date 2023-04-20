//string index out of bound
public class pro4 {
    public static void main(String[] args) {
        String s= "893dju";
        try {
            System.out.println("The convert s to int "+(Integer.parseInt(s)));
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }

    }
}
