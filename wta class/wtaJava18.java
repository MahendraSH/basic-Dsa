// static method in java

class Demo2 {

    static int  sum(int x,int y){
        return x+y;
    }
}
public class wtaJava18 {
    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        System.out.println("The sum = "+Demo2.sum(10,20));
        System.out.println("The sum = "+demo.sum(40,20));

        // it can we asscessed using class_name.function()
        //  and also using obj_of_class.function_name()
    }
}
