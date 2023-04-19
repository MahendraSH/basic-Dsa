package DataTypesVariableArrays;
// variable lifeTime
//variables are created when their scope is
//        entered, and destroyed when their scope is left. This means that a variable will not hold its
//        value once it has gone out of scope.
public class pro7 {
    public static void main(String[] args) {

        int y =200;
        for(int i=0;i< 20;i++){
            System.out.println("The y in block y ="+y);
            y=y-2;
        }
        System.out.println("the y outside the block y ="+y);


    }
}
