// array index out of bound
public class pro2 {
    public static void main(String[] args) {
        int []arr={49,43,53,53,5};
        try{
            System.out.println("index 20 ele"+ arr[20]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }

}
