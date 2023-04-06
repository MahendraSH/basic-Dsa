package partice;
//system.exit(0/1)
//exit is a static class in system class
public class pra3 {
    public static void main(String[] args) {
        int n;
        n=1;
        if(n>5){
            System.out.println("it is grater then 5 ");
            System.exit(0); // for normal exit
        }
        else {
            System.out.println("it is not grater the 5");
            System.exit(1); // for error exit
        }
        }
    }


