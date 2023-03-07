// wtaJava11.java
// sum of two numbers using command line arguments 

public class wtaJava11 {
    public static void main(String[] args) {
        System.out.println(
                "sum ="
                        + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
    }
}