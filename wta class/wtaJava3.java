// wtaJava3.java
//  exit statmet in java 
// System.exit(0/1)
//  exit is a static class in System file
public class wtaJava3{
    public static void main(String ... args){
        int n=1;
        // int n=1;
        if(n==0)
        {
            System.out.println("it is zero before");
            System.exit(0); // for normal exit
        }
        else{
            System.out.println("not zero");
            System.exit(1); // for error exit
        }
    }
}
